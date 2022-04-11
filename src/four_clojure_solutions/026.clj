(ns four-clojure-solutions.026)

; https://4clojure.oxal.org/#/problem/26
; Write a function which returns the first X fibonacci numbers.

;---------------------------------------------

(defn fibonacci-v1 [n]
  (loop [i 0 f 1 s 1 fibs-acc []]
    (if (or (nil? n) (neg? n) (= i n))
      fibs-acc
      (recur (inc i) s (+ f s) (conj fibs-acc f)))))

(defn fibonacci-v2
  [n]
  (take n
        ((defn fib [x y] (lazy-seq (cons x (fib y (+ x y)))))
         1 1)))

(defn fibonacci-v3
  [n]
  (take n
        (map first (iterate
                     (fn [[f s]] [s (+ f s)])
                     [1 1]))))

;---------------------------------------------

(= (fibonacci-v3 3) '(1 1 2))
(= (fibonacci-v3 6) '(1 1 2 3 5 8))
(= (fibonacci-v3 8) '(1 1 2 3 5 8 13 21))
