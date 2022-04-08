(ns four-clojure-solutions.024-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.024 :refer :all]))

(deftest problem-024-test
  (testing "sum sequence of numbers"
    ; problem tests
    (is (= (sum [1 2 3]) 6))
    (is (= (sum (list 0 -2 5 5)) 8))
    (is (= (sum #{4 2 1}) 7))
    (is (= (sum '(0 0 -1)) -1))
    (is (= (sum '(1 10 3)) 14))
    ; more tests
    (is (= (sum []) 0))
    (is (= (sum nil) 0))))
