(ns four-clojure-solutions.020-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.020 :refer :all]))

(deftest question-020-test
  (testing "second last function"
    ; problem tests
    (is (= (second-last-v2 (list 1 2 3 4 5)) 4))
    (is (= (second-last-v2 ["a" "b" "c"]) "b"))
    (is (= (second-last-v2 [[1 2] [3 4]]) [1 2]))
    ; more tests
    (is (= (second-last-v2 [])))
    (is (= (second-last-v2 nil)))))
