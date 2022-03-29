(ns four-clojure-solutions.015-test
  (:require [clojure.test :refer :all]))

(deftest question-015-test
  (testing "function to double a number"
    (= (#(* 2 %) 2) 4)
    (= (#(* 2 %) 3) 6)
    (= (#(* 2 %) 11) 22)
    (= (#(* 2 %) 7) 14)))
