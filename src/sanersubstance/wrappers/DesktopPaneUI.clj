(ns sanersubstance.wrappers.DesktopPaneUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceDesktopPaneUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceDesktopPaneUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.DesktopPaneUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceDesktopPaneUI createUI c)))
