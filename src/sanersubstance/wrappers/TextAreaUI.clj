(ns sanersubstance.wrappers.TextAreaUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceTextAreaUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceTextAreaUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.TextAreaUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceTextAreaUI createUI c)))
