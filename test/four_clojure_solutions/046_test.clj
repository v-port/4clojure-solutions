(ns four-clojure-solutions.046-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.046 :refer :all]))

(deftest problem-046-test
  (testing "flip arguments higher order function"
    (is (= 3 ((flip-args nth) 2 [1 2 3 4 5])))
    (is (= true ((flip-args >) 7 8)))
    (is (= 4 ((flip-args quot) 2 8)))
    (is (= [1 2 3] ((flip-args take) [1 2 3 4 5] 3)))))
