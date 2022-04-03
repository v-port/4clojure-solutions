(ns four-clojure-solutions.020)

; https://4clojure.oxal.org/#/problem/20
; Write a function which returns the second to last element from a sequence.

;---------------------------------------------

(defn second-last-v1 [col]
  (let [col-length (count col)]
    (if (< col-length 2)
      nil
      (nth col (- col-length 2)))))

(defn second-last-v2 [col] (second (reverse col)))

;---------------------------------------------

(= (second-last-v2 (list 1 2 3 4 5)) 4)
(= (second-last-v2 ["a" "b" "c"]) "b")
(= (second-last-v2 [[1 2] [3 4]]) [1 2])
