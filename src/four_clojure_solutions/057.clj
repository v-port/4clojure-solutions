(ns  four-clojure-solutions.057)

;; https://4clojure.oxal.org/#/problem/057

;;----------------------------------------------------------------------------

(= [5 4 3 2 1] ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))
