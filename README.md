# sanersubstance

This is a work around for the EDT ui thread error overkill that 
results when using the Swing Substance look and feel library
in conjunction with other non-EDT aware libs like seesaw, incanter,
and spork, nightcode  (MOST swing-based libs!).  Provided are a set 
wrapper classes and a generator that emits clojure gen-classss 
that exist solely to wrap the default behavior of Substance's 
UI classes, ensuring that calls to createUI are actually 
happening on the EDT.  No more spurious ui exceptions, 
while keeping consistent with Substance's sensitive threading model.
	
## Usage

(require 'sanersubtance.core)
;;somewhere after loading Substance platform look and feel...

(sanersubstance.core/enforce-event-dispatch)

## License

Copyright © 2017 joinr

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
