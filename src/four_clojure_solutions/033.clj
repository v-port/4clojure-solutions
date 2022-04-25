(ns four-clojure-solutions.033)

; https://4clojure.oxal.org/#/problem/33
; Write a function which replicates each element
; of a sequence a variable number of times.

;---------------------------------------------

(defn replicate-elems-v1 [col n]
  (mapcat #(repeat n %) col))

(defn replicate-elems-v2 [col n]
  (apply interleave (repeat n col)))

;---------------------------------------------

(comment
  (= (replicate-elems-v2 [1 2 3] 2) '(1 1 2 2 3 3))
  (= (replicate-elems-v2 [:a :b] 4) '(:a :a :a :a :b :b :b :b))
  (= (replicate-elems-v2 [4 5 6] 1) '(4 5 6))
  (= (replicate-elems-v2 [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
  (= (replicate-elems-v2 [44 33] 2) [44 44 33 33]))
