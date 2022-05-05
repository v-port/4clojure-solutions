(ns four-clojure-solutions.037)

;https://4clojure.oxal.org/#/problem/37

;---------------------------------------------

(comment
  (= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce "))))
