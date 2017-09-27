(ns sanersubstance.wrappers.ToolBarSeparatorUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceToolBarSeparatorUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceToolBarSeparatorUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.ToolBarSeparatorUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceToolBarSeparatorUI createUI c)))
