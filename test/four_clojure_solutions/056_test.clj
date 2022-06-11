(ns four-clojure-solutions.056-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.056 :refer :all]))

(deftest problem-056-test
  (testing "alternative distinct"
    ; problem tests
    (is (= (distinct-v1-lazy [1 2 1 3 1 2 4]) [1 2 3 4]))
    (is (= (distinct-v1-lazy [:a :a :b :b :c :c]) [:a :b :c]))
    (is (= (distinct-v1-lazy '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
    (is (= (distinct-v1-lazy (range 50)) (range 50)))
    ; more tests
    (is (= (distinct-v1-lazy []) []))
    (is (= (distinct-v1-lazy nil) []))
    (is (= (take 4 (distinct-v1-lazy (range))) [0 1 2 3]))))
