(ns sanersubstance.wrappers.FileChooserUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceFileChooserUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceFileChooserUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.FileChooserUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceFileChooserUI createUI c)))
