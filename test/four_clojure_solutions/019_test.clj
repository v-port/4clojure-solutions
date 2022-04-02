(ns four-clojure-solutions.019-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.019 :refer :all]))

(deftest question-019-test
  (testing "alternative last function"
    ; problem tests
    (is (= (last-v1 [1 2 3 4 5]) 5))
    (is (= (last-v1 '(5 4 3)) 3))
    (is (= (last-v1 ["b" "c" "d"]) "d"))
    ; more tests
    (is (= (last-v1 []) nil))
    (is (= (last-v1 nil) nil))))
