(ns four-clojure-solutions.051)

;;https://4clojure.oxal.org/#/problem/051

;;----------------------------------------------------------------------------

(= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] [1 2 3 4 5]] [a b c d]))
