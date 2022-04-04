(ns four-clojure-solutions.021-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.021 :refer :all]))

(deftest question-021-test
  (testing "alternative nth function"
    ; problem tests
    (is (= (nth-v2 '(4 5 6 7) 2) 6))
    (is (= (nth-v2 [:a :b :c] 0) :a))
    (is (= (nth-v2 [1 2 3 4] 1) 2))
    ; more tests
    (is (= (nth-v2 [0 1] 99) nil))
    (is (= (nth-v2 [0 1] -1) nil))))
