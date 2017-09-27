(ns sanersubstance.wrappers.MenuItemUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceMenuItemUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceMenuItemUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.MenuItemUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceMenuItemUI createUI c)))
