(ns four-clojure-solutions.026-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.026 :refer :all]))

(deftest problem-026-test
  (testing "fibonacci function"
    ; problem tests
    (is (= (fibonacci-v3 3) '(1 1 2)))
    (is (= (fibonacci-v3 6) '(1 1 2 3 5 8)))
    (is (= (fibonacci-v3 8) '(1 1 2 3 5 8 13 21)))
    ; more tests
    (is (= (fibonacci-v3 0) '()))
    (is (= (fibonacci-v3 -1) '()))))
