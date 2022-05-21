(ns buckingham.convert)

;; temperature conversion

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

;; pressure conversion

(defn at->bar [p] (* p 0.980665 ))

(defn bar->at [p] (/ p 0.980665))

(defn atm->bar [p] 0) ;!!!

(defn bar->atm [p] 0) ;!!!

(defn atm->mmHg [p] 0) ;!!!

(defn mmHg->atm [p] 0) ;!!!

(defn bar->Pa [p] 0) ;!!!

(defn Pa->bar [p] 0) ;!!!

(defn mmWC->Pa [p] 0) ;!!!

(defn Pa->mmWC [p] 0) ;!!!

;; energy conversion

(defn kcal->kJ [e] 0) ;!!!

(defn kJ->kcal [e] 0) ;!!!

(defn kWh->kJ [e] 0) ;!!!

(defn kJ->kWh [e] 0) ;!!!

(defn Btu->J [e] 0) ;!!!

(defn J->Btu [e] 0) ;!!!

;; power conversion

(defn hp->W [p] 0) ;!!!

(defn W->hp [p] 0) ;!!!

;; mass conversion

(defn lb->kg [m] 0) ;!!!

(defn kg->lb [m] 0) ;!!!

;; length conversion

(defn ft->m [l] 0) ;!!!

(defn m->ft [l] 0) ;!!!

(defn inch->cm [l] 0) ;!!!

(defn cm->inch [l] 0) ;!!!

(defn cm->m [l] 0) ;!!!

(defn m->cm [l] 0) ;!!!

(defn mm->m [l] 0) ;!!!

(defn m->mm [l] 0) ;!!!

;; volume conversion

(defn US-gallon->liter [v] 0) ;!!!

(defn liter->US-gallon [v] 0) ;!!!

(defn UK-gallon->liter [v] 0) ;!!!

(defn liter->UK-gallon [v] 0) ;!!!

(defn cuft->liter [v] 0) ;!!!

(defn liter->cuft [v] 0) ;!!!

;; heat capacity conversion

(defn Btu-per-lb-F->kJ-per-kg-C [c] 0) ;!!!

(defn kJ-per-kg-C->Btu-per-lb-F [c] 0) ;!!!




