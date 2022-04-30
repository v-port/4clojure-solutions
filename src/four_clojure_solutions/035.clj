(ns four-clojure-solutions.035)

; https://4clojure.oxal.org/#/problem/35

;---------------------------------------------

(comment
  (= 7 (let [x 5] (+ 2 x)))
  (= 7 (let [x 3, y 10] (- y x)))
  (= 7 (let [x 21] (let [y 3] (/ x y)))))
