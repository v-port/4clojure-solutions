(ns four-clojure-solutions.044-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.044 :refer :all]))

(deftest problem-044-test
  (testing "rotating sequences"
    (is (= (rotate-sequence 2 [1 2 3 4 5]) '(3 4 5 1 2)))
    (is (= (rotate-sequence -2 [1 2 3 4 5]) '(4 5 1 2 3)))
    (is (= (rotate-sequence 6 [1 2 3 4 5]) '(2 3 4 5 1)))
    (is (= (rotate-sequence 1 '(:a :b :c)) '(:b :c :a)))
    (is (= (rotate-sequence -4 '(:a :b :c)) '(:c :a :b)))))
