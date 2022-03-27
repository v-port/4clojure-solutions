(ns four-clojure-solutions.014)

;https://4clojure.oxal.org/#/problem/14

;---------------------------------------------

(= 8 ((fn add-five [x] (+ x 5)) 3))
(= 8 ((fn [x] (+ x 5)) 3))
(= 8 (#(+ % 5) 3))
(= 8 ((partial + 5) 3))
