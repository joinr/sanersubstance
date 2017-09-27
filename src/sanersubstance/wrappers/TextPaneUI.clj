(ns sanersubstance.wrappers.TextPaneUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceTextPaneUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceTextPaneUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.TextPaneUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceTextPaneUI createUI c)))
