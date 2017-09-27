(ns sanersubstance.wrappers.ScrollBarUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceScrollBarUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceScrollBarUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.ScrollBarUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceScrollBarUI createUI c)))
