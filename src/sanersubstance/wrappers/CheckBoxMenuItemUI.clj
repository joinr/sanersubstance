(ns sanersubstance.wrappers.CheckBoxMenuItemUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceCheckBoxMenuItemUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceCheckBoxMenuItemUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.CheckBoxMenuItemUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceCheckBoxMenuItemUI createUI c)))
