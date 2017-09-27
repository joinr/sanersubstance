(ns sanersubstance.wrappers.FormattedTextFieldUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceFormattedTextFieldUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceFormattedTextFieldUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.FormattedTextFieldUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceFormattedTextFieldUI createUI c)))
