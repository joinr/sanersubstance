(ns sanersubstance.wrappers.PopupMenuSeparatorUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstancePopupMenuSeparatorUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstancePopupMenuSeparatorUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.PopupMenuSeparatorUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstancePopupMenuSeparatorUI createUI c)))
