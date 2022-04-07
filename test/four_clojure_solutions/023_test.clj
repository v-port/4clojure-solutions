(ns four-clojure-solutions.023-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.023 :refer :all]))

(deftest problem-023-test
  (testing "alternative reverse function"
    ; problem tests
    (is (= (reverse-v1 [1 2 3 4 5]) [5 4 3 2 1]))
    (is (= (reverse-v1 (sorted-set 5 7 2 7)) '(7 5 2)))
    (is (= (reverse-v1 [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]]))
    ; more tests
    (is (= (reverse-v1 []) '()))
    (is (= (reverse-v1 nil) '()))))
