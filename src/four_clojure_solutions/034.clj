(ns four-clojure-solutions.034)

; https://4clojure.oxal.org/#/problem/34
; Write a function which creates a list of all integers in a given range.
; Restrictions - range

;---------------------------------------------

(defn range-v1
  [start end]
  (let [range-length (- end start)]
    (take range-length (iterate inc start))))

;---------------------------------------------

(comment
  (= (range-v1 1 4) '(1 2 3))
  (= (range-v1 -2 2) '(-2 -1 0 1))
  (= (range-v1 5 8) '(5 6 7)))
