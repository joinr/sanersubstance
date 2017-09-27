(ns sanersubstance.wrappers.PopupMenuUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstancePopupMenuUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstancePopupMenuUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.PopupMenuUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstancePopupMenuUI createUI c)))
