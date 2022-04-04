(ns four-clojure-solutions.021)

; https://4clojure.oxal.org/#/problem/21
; Write a function which returns the nth element from a sequence.
; Restrictions: nth

;---------------------------------------------

(defn nth-v1 [coll n]
  (first (drop n coll)))

(defn nth-v2
  "returns nil if less elements"
  [col n]
  (cond
    (neg? n) nil
    (empty? col) nil
    (zero? n) (first col)
    :else (recur (rest col) (dec n))))

;---------------------------------------------

(= (nth-v2 '(4 5 6 7) 2) 6)
(= (nth-v2 [:a :b :c] 0) :a)
(= (nth-v2 [1 2 3 4] 1) 2)
(= (nth-v2 '([1 2] [3 4] [5 6]) 2) [5 6])
