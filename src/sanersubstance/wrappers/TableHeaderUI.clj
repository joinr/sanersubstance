(ns sanersubstance.wrappers.TableHeaderUI (:require [sanersubstance.wrappers]) (:import [org.pushingpixels.substance.internal.ui.SubstanceTableHeaderUI]))
(gen-class :extends org.pushingpixels.substance.internal.ui.SubstanceTableHeaderUI :init init :constructors {[] []} :methods [^{:static true} [createUI [javax.swing.JComponent] javax.swing.plaf.ComponentUI]] :name sanersubstance.wrappers.TableHeaderUI)
(defn -init [] [[] nil])
(defn -createUI [c] (sanersubstance.wrappers/invoke-now (. org.pushingpixels.substance.internal.ui.SubstanceTableHeaderUI createUI c)))
