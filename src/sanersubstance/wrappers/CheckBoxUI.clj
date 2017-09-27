(ns sanersubstance.wrappers.CheckBoxUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceCheckBoxUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceCheckBoxUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.CheckBoxUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceCheckBoxUI createUI c)))
