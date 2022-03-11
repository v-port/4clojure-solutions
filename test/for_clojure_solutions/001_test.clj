(ns for-clojure-solutions.001-test
  (:require [clojure.test :refer :all]))

(deftest question-001-test
  (testing "equality with true"
    (is (= true true))
    (is (= (nil? nil) true))
    (is (= (= 1 1) true))))
