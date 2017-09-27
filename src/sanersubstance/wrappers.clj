(ns sanersubstance.wrappers
  (:require [clojure.pprint :refer [pprint]])
  (:import [javax.swing SwingUtilities]))

;;source from the seesaw library by Dave Ray and contributors.
;;https://github.com/daveray/seesaw
;;Reused here to eliminate entire seesaw dependency.
;;Begin seesaw.
;;seesaw/invoke.clj
;;Licensed under the Eclipse Public License 1.0
(defn invoke-now* [f & args]
  (let [result (atom nil)]
   (letfn [(invoker [] (reset! result (apply f args)))]
     (if (SwingUtilities/isEventDispatchThread)
       (invoker)
       (SwingUtilities/invokeAndWait invoker))
     @result)))

(defmacro invoke-now
  "Equivalent to SwingUtilities/invokeAndWait. Executes the given body immediately
  on the Swing UI thread, possibly blocking the current thread if it's not the Swing
  UI thread. Returns the result of executing body. For example,

    (invoke-now
      (config! my-label :text \"New Text\"))

  Notes:
    Be very careful with this function in the presence of locks and stuff.

    (seesaw.core/invoke-now) is an alias of this macro.

  See:
    http://download.oracle.com/javase/6/docs/api/javax/swing/SwingUtilities.html#invokeAndWait(java.lang.Runnable) 
  "
  [& body] `(invoke-now*   (fn [] ~@body)))
;;End seesaw

(defmacro wrapper-class [subclass nm]
  (let [nsname (symbol nm #_(clojure.string/join "."
                          (butlast (clojure.string/split nm #"\."))))
        oldclass (last (clojure.string/split  (name subclass) #"\."))
        classname (symbol nm)]
    `(do (~'ns ~nsname
           (:require [~'sanersubstance.wrappers])
           (:import [~subclass]))
         
         (~'gen-class
          :extends ~subclass
                                        ;:state state
          :init ~'init
          :constructors {[] []}
          :methods [~(with-meta  '[createUI [javax.swing.JComponent]
                                   javax.swing.plaf.ComponentUI]
                      {:static true})]
          :name ~classname
          )
    
    (~'defn ~'-init []
      [[] nil])
    
    ;;override the static method...
    (~'defn ~'-createUI [~'c]
      (~'sanersubstance.wrappers/invoke-now
       (. ~subclass ~'createUI ~'c))))))

(def prefix "org.pushingpixels.substance.internal.ui.Substance")
(defn new-prefix [_ x]
  (clojure.string/replace x prefix  "sanersubstance.wrappers."))

(def defaults
  ["ButtonUI" (str prefix  "ButtonUI")
   "CheckBoxUI" (str prefix  "CheckBoxUI")
   "ComboBoxUI" (str prefix  "ComboBoxUI")
   "CheckBoxMenuItemUI" (str prefix  "CheckBoxMenuItemUI")
   "DesktopIconUI" (str prefix  "DesktopIconUI")
   "DesktopPaneUI" (str prefix  "DesktopPaneUI")
   "EditorPaneUI" (str prefix  "EditorPaneUI")
   "FileChooserUI" (str prefix "FileChooserUI")
   "FormattedTextFieldUI" (str prefix  "FormattedTextFieldUI")
   "InternalFrameUI" (str prefix  "InternalFrameUI")
   "LabelUI" (str prefix  "LabelUI")
   "ListUI" (str prefix  "ListUI")
   "MenuUI" (str prefix  "MenuUI")
   "MenuBarUI" (str prefix  "MenuBarUI")
   "MenuItemUI" (str prefix  "MenuItemUI")
   "OptionPaneUI" (str prefix  "OptionPaneUI")
   "PanelUI" (str prefix  "PanelUI")
   "PasswordFieldUI" (str prefix  "PasswordFieldUI")
   "PopupMenuUI" (str prefix  "PopupMenuUI")
   "PopupMenuSeparatorUI" (str prefix  "PopupMenuSeparatorUI")
   "ProgressBarUI" (str prefix  "ProgressBarUI")
   "RadioButtonUI" (str prefix  "RadioButtonUI")
   "RadioButtonMenuItemUI" (str prefix  "RadioButtonMenuItemUI")
   "RootPaneUI" (str prefix  "RootPaneUI")
   "ScrollBarUI" (str prefix  "ScrollBarUI")
   "ScrollPaneUI" (str prefix  "ScrollPaneUI")
   "SeparatorUI" (str prefix  "SeparatorUI")
   "SliderUI" (str prefix  "SliderUI")
   "SpinnerUI" (str prefix  "SpinnerUI")
   "SplitPaneUI" (str prefix  "SplitPaneUI")
   "TabbedPaneUI" (str prefix  "TabbedPaneUI")
   "TableUI" (str prefix  "TableUI")
   "TableHeaderUI" (str prefix  "TableHeaderUI")
   "TextAreaUI" (str prefix  "TextAreaUI")
   "TextFieldUI" (str prefix  "TextFieldUI")
   "TextPaneUI" (str prefix  "TextPaneUI")
   "ToggleButtonUI" (str prefix  "ToggleButtonUI")
   "ToolBarUI" (str prefix  "ToolBarUI")
   "ToolBarSeparatorUI" (str prefix "ToolBarSeparatorUI")
   "ToolTipUI" (str prefix  "ToolTipUI")
   "TreeUI" (str prefix  "TreeUI")
   "ViewportUI" (str prefix  "ViewportUI") ])
                              

(def new-defaults
  (->> (for [[l r] (partition 2 defaults)]
         [l (new-prefix l r)])
       (flatten)
       (vec)))

(defn namespaces []
  (map (fn [ls rs]
         [(first ls) (second ls) (second rs)])
       (partition 2 defaults) (partition 2 new-defaults)))

(defn spit-wrappers! []
  (doseq [[cls from to] (namespaces)]
    (println [:spitting cls from to])
    (spit (str "./src/sanersubstance/wrappers/" cls ".clj")
          (with-out-str
            (doseq [frm (rest (macroexpand-1 `(wrapper-class ~(symbol from) ~to)))]
              (binding [*print-meta* true]
                (prn frm )))))))
          

(defn wrap-defaults!
  "Public API for replacing the default Substance EDT-sensitive look and feel
   uicomponents with wrapped components that force component creation to occur
   on the swing event dispatch thread."
  []
  (let [tbl (javax.swing.UIManager/getDefaults)
        ]
    (doseq [[k v] (partition 2 new-defaults)]
      (javax.swing.UIManager/put k v))))
