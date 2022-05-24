(ns four-clojure-solutions.047)

; https://4clojure.oxal.org/#/problem/047

(contains? #{4 5 6} 4)
(contains? [1 1 1 1 1] 4)
(contains? {4 :a 2 :b} 4)
(not (contains? [1 2 4] 3))

;---------------------------------------------

(comment
  (contains? #{4 5 6} 4)
  (not (contains? #{4 5 6} 7))
  (contains? [1 1 1 1 1] 0)
  (contains? [1 1 1 1 1] 4)
  (not (contains? [1 1 1 1 1] 5))
  (contains? {4 :a 2 :b} 4)
  (not (contains? [1 2 4] 3)))
