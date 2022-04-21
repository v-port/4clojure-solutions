(ns four-clojure-solutions.030)

; https://4clojure.oxal.org/#/problem/30
; Write a function which removes consecutive duplicates from a sequence.

;---------------------------------------------

(defn remove-consecutive-duplicates [col]
  (reduce
    (fn
      [acc, x]
      (if (= (last acc) x)
        acc
        (conj acc x)))
    []
    col))

(defn remove-consecutive-duplicates-v2
  [col]
  (map first (partition-by identity col)))

;---------------------------------------------

(comment
  (= (apply str (remove-consecutive-duplicates-v2 "Leeeeeerrroyyy")) "Leroy")
  (= (remove-consecutive-duplicates-v2 [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
  (= (remove-consecutive-duplicates-v2 [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))
