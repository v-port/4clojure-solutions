(ns four-clojure-solutions.007)

;https://4clojure.oxal.org/#/problem/7
;When operating on a Vector, the conj function will return a
;new vector with one or more items "added" to the end.

;---------------------------------------------

(= [1 2 3 4] (conj [1 2 3] 4))
(= [1 2 3 4] (conj [1 2] 3 4))