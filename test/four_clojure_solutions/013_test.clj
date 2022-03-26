(ns four-clojure-solutions.013-test
  (:require [clojure.test :refer :all]))

(deftest question-013-test
  (testing "rest on sequences"
    (is (= [20 30 40] (rest [10 20 30 40])))
    (is (= (rest ())))
    (is (= (rest nil)))))