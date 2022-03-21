(ns four-clojure-solutions.010)

;https://4clojure.oxal.org/#/problem/10

;---------------------------------------------

(= 20 ((hash-map :a 10, :b 20, :c 30) :b))
(= 20 (:b {:a 10, :b 20, :c 30}))
