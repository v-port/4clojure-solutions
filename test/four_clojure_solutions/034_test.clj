(ns four-clojure-solutions.034-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.034 :refer :all]))

(deftest problem-034-test
  (testing "alternative range function"
    (is (= (range-v1 1 4) '(1 2 3)))
    (is (= (range-v1 -2 2) '(-2 -1 0 1)))
    (is (= (range-v1 5 8) '(5 6 7)))))
