(ns four-clojure-solutions.031)

; https://4clojure.oxal.org/#/problem/31
; Write a function which packs consecutive duplicates into sub-lists.

;---------------------------------------------

(defn pack-continuous-duplicates-v1
  [col]
  (loop [col col acc []]
    (if (empty? col)
      acc
      (let [x (first col)
            [equal-to-x after-x] (split-with #(= x %) col)]
        (recur after-x (conj acc equal-to-x))))))

(defn pack-continuous-duplicates-v2
  [col]
  (partition-by identity col))

;---------------------------------------------

(comment
  (= (pack-continuous-duplicates-v2 [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
  (= (pack-continuous-duplicates-v2 [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
  (= (pack-continuous-duplicates-v2 [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))
