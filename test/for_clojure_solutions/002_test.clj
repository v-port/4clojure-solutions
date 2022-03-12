(ns for-clojure-solutions.002-test
  (:require [clojure.test :refer :all]))

(deftest question-002-test
  (testing "basic operations"
    (is (= (- 10 (* 2 3)) 4))))
