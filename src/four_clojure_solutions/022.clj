(ns four-clojure-solutions.022)

; https://4clojure.oxal.org/#/problem/22
; Write a function which returns the total number
; of elements in a sequence.
; Restrictions: count

;---------------------------------------------

(defn count-v1 [coll]
  (loop [c coll total 0]
    (cond
      (empty? c) total
      :else (recur (rest c) (inc total)))))

(defn count-v2 [coll]
  (apply + (map (constantly 1) coll)))

(defn count-v3 [coll]
  (reduce + (map (constantly 1) coll)))

;---------------------------------------------

(= (count-v3 '(1 2 3 3 1)) 5)
(= (count-v3 "Hello World") 11)
(= (count-v3 [[1 2] [3 4] [5 6]]) 3)
(= (count-v3 '(13)) 1)
(= (count-v3 '(:a :b :c)) 3)
