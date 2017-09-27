(ns sanersubstance.wrappers.ScrollPaneUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceScrollPaneUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceScrollPaneUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.ScrollPaneUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceScrollPaneUI createUI c)))
