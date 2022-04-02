(ns four-clojure-solutions.019)

; https://4clojure.oxal.org/#/problem/19
; Write a function which returns the last element in a sequence.
; Restrictions: last

;---------------------------------------------

(defn last-v1 [coll]
  (first (reverse coll)))

(defn last-v2 [coll]
  (nth coll (- (count coll) 1) nil))

;---------------------------------------------

(= (last-v2 [1 2 3 4 5]) 5)
(= (last-v2 '(5 4 3)) 3)
(= (last-v2 ["b" "c" "d"]) "d")
(= (last-v2 []) nil)
(= (last-v2 nil) nil)
