(ns four-clojure-solutions.054-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.054 :refer :all]))

(deftest problem-054-test
  (testing "alternative partition function"
    ;; problem tests
    (is (= (partition-v1 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
    (is (= (partition-v1 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
    (is (= (partition-v1 3 (range 8)) '((0 1 2) (3 4 5))))
    ;; more tests
    (is (= (partition-v1 3 nil) '()))
    (is (= (partition-v1 3 []) '()))
    (is (= (partition-v1 -3 (range 9)) '()))
    (is (= (partition-v1 3 (range 9)) [[0 1 2] [3 4 5] [6 7 8]]))
    (is (= (partition-v1 3 (range 10)) [[0 1 2] [3 4 5] [6 7 8]]))
    (is (= (partition-v1 3 (range 11)) [[0 1 2] [3 4 5] [6 7 8]]))
    (is (= (partition-v1 3 (range 12)) [[0 1 2] [3 4 5] [6 7 8] [9 10 11]]))
    (is (= (take 5 (partition-v1 3 (range))) [[0 1 2] [3 4 5] [6 7 8] [9 10 11] [12 13 14]]))))
