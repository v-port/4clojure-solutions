(ns four-clojure-solutions.039)

; https://4clojure.oxal.org/#/problem/39
; Write a function which takes two sequences and
; returns the first item from each, then the second
; item from each, then the third, etc.
; Restrictions - interleave

;---------------------------------------------

(defn interleave-v1 [c1 c2]
  (apply concat (map vector c1 c2)))

(defn interleave-v2 [c1 c2]
  (flatten (map vector c1 c2)))

(defn interleave-v3 [c1 c2]
  (mapcat #(list %1 %2) c1 c2))

;---------------------------------------------

(comment
  (= (interleave-v3 [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
  (= (interleave-v3 [1 2] [3 4 5 6]) '(1 3 2 4))
  (= (interleave-v3 [1 2 3 4] [5]) [1 5])
  (= (interleave-v3 [30 20] [25 15]) [30 25 20 15]))
