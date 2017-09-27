(ns sanersubstance.wrappers.PasswordFieldUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstancePasswordFieldUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstancePasswordFieldUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.PasswordFieldUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstancePasswordFieldUI createUI c)))
