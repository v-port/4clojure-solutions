(ns four-clojure-solutions.047-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.047 :refer :all]))

(deftest problem-047-test
  (testing "contains function"
    (is (contains? #{4 5 6} 4))
    (is (not (contains? #{4 5 6} 7)))
    (is (contains? [1 1 1 1 1] 0))
    (is (contains? [1 1 1 1 1] 4))
    (is (not (contains? [1 1 1 1 1] 5)))
    (is (contains? {4 :a 2 :b} 4))
    (is (not (contains? [1 2 4] 3)))))
