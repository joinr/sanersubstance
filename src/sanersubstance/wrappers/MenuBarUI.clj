(ns sanersubstance.wrappers.MenuBarUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceMenuBarUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceMenuBarUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.MenuBarUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceMenuBarUI createUI c)))
