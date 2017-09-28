(ns sanersubstance.wrappers.MenuBarUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceMenuBarUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceMenuBarUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :exposes-methods {installUI installUIParent, uninstallUI uninstallUIParent} :name sanersubstance.wrappers.MenuBarUI)
(defn -init [] [[] nil])
(defn -createUI [c] (clojure.core/when sanersubstance.wrappers/*debugging* (clojure.core/println "createUI")) (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceMenuBarUI createUI c)))
(defn -installUI [o c] (clojure.core/when sanersubstance.wrappers/*debugging* (clojure.core/println "installUI")) (sanersubstance.wrappers/invoke-now (.installUIParent o c)))
(defn -uninstallUI [o c] (clojure.core/when sanersubstance.wrappers/*debugging* (clojure.core/println "uninstallUI")) (sanersubstance.wrappers/invoke-now (.uninstallUIParent o c)))
