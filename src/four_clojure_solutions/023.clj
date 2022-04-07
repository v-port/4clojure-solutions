(ns four-clojure-solutions.023)

; Write a function which reverses a sequence.
; https://4clojure.oxal.org/#/problem/23
; Restrictions - reverse

;---------------------------------------------

(defn reverse-v1 [coll] (into '() coll))

;---------------------------------------------

(= (reverse-v1 [1 2 3 4 5]) [5 4 3 2 1])
(= (reverse-v1 (sorted-set 5 7 2 7)) '(7 5 2))
(= (reverse-v1 [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]])
