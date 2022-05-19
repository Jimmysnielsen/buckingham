;
(defn celcius->fahrenheit
  "Convert Celcius temperature into Fahrenheit"
  [t]   (+ 32 (* t 9/5)))

(defn fahrenheit->celcius 
  "Convert Fahrenheit temperature into Celcius"
  [t] (* 5/9 (- t 32)))

(defn celcius->kelvin
  "Convert Celcius temperature into Kelvin"
  [t] (+ t 273.15))

(defn kelvin->celcius
  "Convert Kelvin temperature into Celcius"
  [t] (- t 273.15))

(defn kelvin->rankine
  "Convert Kelvin temperature into Rankine"
  [t] (* t 1.8))

(defn rankine->kelvin
  "Convert Rankine temperature into Kelvin"
  [t] (/ t 1.8))


