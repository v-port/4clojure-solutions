(ns four-clojure-solutions.049)

; https://4clojure.oxal.org/#/problem/049
; Write a function which will split a sequence into two parts.
; Restrictions: split-at

;---------------------------------------------

(defn split-at-v1 [n, coll]
  [(take n coll) (drop n coll)])

;---------------------------------------------

(comment
  (= (split-at-v1 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
  (= (split-at-v1 1 [:a :b :c :d]) [[:a] [:b :c :d]])
  (= (split-at-v1 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))
