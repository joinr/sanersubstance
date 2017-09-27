(ns sanersubstance.wrappers.PanelUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstancePanelUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstancePanelUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.PanelUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstancePanelUI createUI c)))
