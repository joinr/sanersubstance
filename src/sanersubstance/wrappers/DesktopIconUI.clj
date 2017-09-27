(ns sanersubstance.wrappers.DesktopIconUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceDesktopIconUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceDesktopIconUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.DesktopIconUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceDesktopIconUI createUI c)))
