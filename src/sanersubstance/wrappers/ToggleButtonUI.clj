(ns sanersubstance.wrappers.ToggleButtonUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceToggleButtonUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceToggleButtonUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.ToggleButtonUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceToggleButtonUI createUI c)))
