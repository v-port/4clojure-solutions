(ns four-clojure-solutions.010-test
  (:require [clojure.test :refer :all]))

(deftest question-010-test
  (testing "hash-map operations"
    (is (= 20 ((hash-map :a 10, :b 20, :c 30) :b)))
     (is (= 20 (:b {:a 10, :b 20, :c 30})))))