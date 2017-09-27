(defproject sanersubstance "0.1.0-SNAPSHOT"
  :description
  "This is a work around for the EDT ui thread error overkill that 
   results when using the Swing Substance look and feel library
   in conjunction with other non-EDT aware libs like seesaw, incanter,
   and spork, nightcode  (MOST swing-based libs!).  Provided are a set 
   wrapper classes and a generator that emits clojure gen-classss 
   that exist solely to wrap the default behavior of Substance's 
   UI classes, ensuring that calls to createUI are actually 
   happening on the EDT.  No more spurious ui exceptions, 
   while keeping consistent with Substance's sensitive threading model."
  :url "http://github.com/joinr/sanersubstance"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot [#"wrappers.*"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.github.insubstantial/substance "7.3"]])
