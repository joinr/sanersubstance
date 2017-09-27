(ns sanersubstance.wrappers.ProgressBarUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceProgressBarUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceProgressBarUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.ProgressBarUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceProgressBarUI createUI c)))
