(ns four-clojure-solutions.011)

;https://4clojure.oxal.org/#/problem/11

;---------------------------------------------

(= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3]))