(ns sanersubstance.wrappers.SpinnerUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceSpinnerUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceSpinnerUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.SpinnerUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceSpinnerUI createUI c)))
