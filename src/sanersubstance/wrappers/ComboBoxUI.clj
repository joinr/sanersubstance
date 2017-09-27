(ns sanersubstance.wrappers.ComboBoxUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceComboBoxUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceComboBoxUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.ComboBoxUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceComboBoxUI createUI c)))
