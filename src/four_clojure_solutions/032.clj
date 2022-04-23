(ns four-clojure-solutions.032)

; https://4clojure.oxal.org/#/problem/32
; Write a function which duplicates each element of a sequence.

;---------------------------------------------

(defn duplicate-elements-v1
  "Duplicates each element in a sequence. Does not work with infinite sequences."
  [col]
  (reduce
    (fn [acc x] (conj acc x x))
    []
    col))

(defn duplicate-elements-v2
  "Duplicates each element in a sequence. Works with infinite sequences."
  [col]
  (interleave col col))

(comment
  (= (duplicate-elements-v2 [1 2 3]) '(1 1 2 2 3 3))
  (= (duplicate-elements-v2 [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
  (= (duplicate-elements-v2 [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
  (= (duplicate-elements-v2 [44 33]) [44 44 33 33]))
