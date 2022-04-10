(ns four-clojure-solutions.025)

; https://4clojure.oxal.org/#/problem/25
; Write a function which returns only the odd numbers from a sequence.

;---------------------------------------------

(defn filter-odd [x]
  (filter odd? x))

;---------------------------------------------

(= (filter-odd #{1 2 3 4 5}) '(1 3 5))
(= (filter-odd [4 2 1 6]) '(1))
(= (filter-odd [2 2 4 6]) '())
(= (filter-odd [1 1 1 3]) '(1 1 1 3))
