(ns sanersubstance.wrappers.EditorPaneUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceEditorPaneUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceEditorPaneUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.EditorPaneUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceEditorPaneUI createUI c)))
