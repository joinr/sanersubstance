(ns sanersubstance.wrappers.RadioButtonUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceRadioButtonUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceRadioButtonUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.RadioButtonUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceRadioButtonUI createUI c)))
