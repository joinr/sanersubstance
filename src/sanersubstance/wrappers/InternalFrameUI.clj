(ns sanersubstance.wrappers.InternalFrameUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceInternalFrameUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceInternalFrameUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.InternalFrameUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceInternalFrameUI createUI c)))
