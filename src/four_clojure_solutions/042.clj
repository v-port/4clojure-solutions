(ns four-clojure-solutions.042)

; https://4clojure.oxal.org/#/problem/42
; Write a function which calculates factorials.

;---------------------------------------------

(defn factorial-v1
  ([n] (factorial-v1 n 1))
  ([n acc]
   (cond
     (< n 0) nil
     (= n 0) acc
     :else (recur (dec n) (*' acc n)))))

(defn factorial-v2
  [n]
  (cond
    (< n 0) nil
    (= n 0) 1
    :else (reduce
            *'
            (range 1 (inc n)))))

;---------------------------------------------

(comment
  (= (factorial-v2 1) 1)
  (= (factorial-v2 3) 6)
  (= (factorial-v2 5) 120)
  (= (factorial-v2 8) 40320))
