(ns four-clojure-solutions.048)

; https://4clojure.oxal.org/#/problem/048

;---------------------------------------------

(= 6 (some #{2 7 6} [5 6 7 8]))
(= 6 (some #(when (even? %) %) [5 6 7 8]))

;---------------------------------------------

(comment
  (= 6 (some #{2 7 6} [5 6 7 8]))
  (= 6 (some #(when (even? %) %) [5 6 7 8]))
  (some even? [1 2 3 4])
  (nil? (some even? [1 3])))
