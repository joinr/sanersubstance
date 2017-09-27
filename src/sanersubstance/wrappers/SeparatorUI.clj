(ns sanersubstance.wrappers.SeparatorUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceSeparatorUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceSeparatorUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.SeparatorUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceSeparatorUI createUI c)))
