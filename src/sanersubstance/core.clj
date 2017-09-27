(ns sanersubstance.core
  (:require [sanersubstance.wrappers]))

(defn enforce-event-dispatch
  "This lets us work around the EDT-insanity that is instilled by the
  substance theme, and wraps the substance ui creation calls with an
  intermediate class that ensures createUI and friends are shuttled to
  the event dispatch thread if not already there, via
  seesaw.core/invoke-now.  Otherwise, we get lots of errors for
  uithread exceptions and the like, and changing the public api for
  things like Incanter and other libs - which are completely
  insensitive to the EDT issue unlike the Substance look and feel lib.
  This way, we basically hack substance from the inside out.

  Typical usage is after invoking a Substance look and feel, 
  and loading skins, etc., you call this to replace the 
  loaded default classes with wrapper classes from  
  sanersubstance.wrappers."
  []
  (sanersubstance.wrappers/wrap-defaults!))
