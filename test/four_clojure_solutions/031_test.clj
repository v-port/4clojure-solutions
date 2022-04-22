(ns four-clojure-solutions.031-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.031 :refer :all]))

(deftest problem-031-test
  (testing "pack-continuous-duplicates-v2 function"
    ; problem tests
    (is (= (pack-continuous-duplicates-v2 [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
    (is (= (pack-continuous-duplicates-v2 [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
    (is (= (pack-continuous-duplicates-v2 [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))
    ; more tests
    (is (= (pack-continuous-duplicates-v2 []) []))
    (is (= (pack-continuous-duplicates-v2 nil) []))))
