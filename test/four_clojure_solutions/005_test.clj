(ns four-clojure-solutions.005-test
  (:require [clojure.test :refer :all]))

(deftest question-005-test
  (testing "conj function"
    (is (= '(1 2 3 4) (conj '(2 3 4) 1)))
    (is (= '(1 2 3 4) (conj '(3 4) 2 1)))))
