(ns sanersubstance.wrappers.OptionPaneUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceOptionPaneUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceOptionPaneUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.OptionPaneUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceOptionPaneUI createUI c)))
