(ns four-clojure-solutions.045)

; https://4clojure.oxal.org/#/problem/045

;---------------------------------------------

(= [1 4 7 10 13] (take 5 (iterate #(+ 3 %) 1)))

;---------------------------------------------

(comment
  (= [1 4 7 10 13] (take 5 (iterate #(+ 3 %) 1)))
  (= [5 6 7 8 9 10 11 12 13 14] (take 10 (iterate inc 5)))
  (= [1 2 4 8 16 32 64 128 256 512] (take 10 (iterate (fn [x] (* 2 x)) 1))))
