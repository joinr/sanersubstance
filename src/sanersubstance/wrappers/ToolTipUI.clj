(ns sanersubstance.wrappers.ToolTipUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceToolTipUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceToolTipUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.ToolTipUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceToolTipUI createUI c)))
