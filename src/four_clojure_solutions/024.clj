(ns four-clojure-solutions.024)

; https://4clojure.oxal.org/#/problem/24
; Write a function which returns the sum of a sequence of numbers.

;---------------------------------------------

(defn sum [coll]
  (apply + coll))

;---------------------------------------------

(= (sum [1 2 3]) 6)
(= (sum (list 0 -2 5 5)) 8)
(= (sum #{4 2 1}) 7)
(= (sum '(0 0 -1)) -1)
(= (sum '(1 10 3)) 14)
