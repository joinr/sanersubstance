(ns sanersubstance.wrappers.ToolBarUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceToolBarUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceToolBarUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.ToolBarUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceToolBarUI createUI c)))
