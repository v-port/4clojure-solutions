(ns four-clojure-solutions.028-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.028 :refer :all]))

(deftest problem-028-test
  (testing "alternative flatten"
    (is (= (flatten-v2 '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
    (is (= (flatten-v2 ["a" ["b"] "c"]) '("a" "b" "c")))
    (is (= (flatten-v2 '((((:a))))) '(:a)))
    (is (= (flatten-v2 '()) '()))))
