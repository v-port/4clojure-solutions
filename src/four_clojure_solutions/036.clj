(ns four-clojure-solutions.036)

;https://4clojure.oxal.org/#/problem/36

;---------------------------------------------

(= 10 (let [x 7 y 3 z 1] (+ x y)))
(= 4 (let [x 7 y 3 z 1] (+ y z)))
(= 1 (let [x 7 y 3 z 1] z))
