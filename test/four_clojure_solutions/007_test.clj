(ns four-clojure-solutions.007-test
  (:require [clojure.test :refer :all]))

(deftest question-007-test
  (testing "conj on vectors"
    (is (= [1 2 3 4] (conj [1 2 3] 4)))
    (is (= [1 2 3 4] (conj [1 2] 3 4)))))