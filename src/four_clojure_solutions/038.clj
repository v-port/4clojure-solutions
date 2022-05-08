(ns four-clojure-solutions.038)

; https://4clojure.oxal.org/#/problem/38
; Write a function which takes a variable number
; of parameters and returns the maximum value.
; Restrictions: max, max-key

;---------------------------------------------

(defn max-v2
  [x & xs]
  (reduce #(if (> %1 %2) %1 %2) x xs))

;---------------------------------------------

(comment
  (= (max-v2 1 8 3 4) 8)
  (= (max-v2 30 20) 30)
  (= (max-v2 45 67 11) 67))
