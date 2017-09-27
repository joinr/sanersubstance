(ns sanersubstance.wrappers.TextFieldUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceTextFieldUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceTextFieldUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.TextFieldUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceTextFieldUI createUI c)))
