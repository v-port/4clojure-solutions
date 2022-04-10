(ns four-clojure-solutions.025-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.025 :refer :all]))

(deftest problem-025-test
  (testing "filter odd numbers"
    ; problem tests
    (is (= (filter-odd #{1 2 3 4 5}) '(1 3 5)))
    (is (= (filter-odd [4 2 1 6]) '(1)))
    (is (= (filter-odd [2 2 4 6]) '()))
    (is (= (filter-odd [1 1 1 3]) '(1 1 1 3)))
    ; more tests
    (is (= (filter-odd []) '()))
    (is (= (filter-odd nil) '()))))
