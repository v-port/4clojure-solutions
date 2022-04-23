(ns four-clojure-solutions.032-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.032 :refer :all]))

(deftest problem-032-test
  (testing "duplicate elements function"
    ; problem tests
    (is (= (duplicate-elements-v2 [1 2 3]) '(1 1 2 2 3 3)))
    (is (= (duplicate-elements-v2 [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)))
    (is (= (duplicate-elements-v2 [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))
    (is (= (duplicate-elements-v2 [44 33]) [44 44 33 33]))
    ; more tests
    (is (= (take 6 (duplicate-elements-v2 (range))) [0 0 1 1 2 2]))
    (is (= (duplicate-elements-v2 []) []))))
