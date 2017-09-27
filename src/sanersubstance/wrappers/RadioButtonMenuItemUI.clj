(ns sanersubstance.wrappers.RadioButtonMenuItemUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceRadioButtonMenuItemUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceRadioButtonMenuItemUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.RadioButtonMenuItemUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceRadioButtonMenuItemUI createUI c)))
