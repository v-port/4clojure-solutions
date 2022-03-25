(ns four-clojure-solutions.012-test
  (:require [clojure.test :refer :all]))

(deftest question-012-test
  (testing "first, second, last on sequences"
    (is (= 3 (first '(3 2 1))))
    (is (= 3 (second [2 3 4])))
    (is (= 3 (last (list 1 2 3))))))