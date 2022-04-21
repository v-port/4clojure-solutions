(ns four-clojure-solutions.030-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.030 :refer :all]))

(deftest problem-030-test
  (testing "remove-consecutive-duplicates function"
    (is (= (apply str (remove-consecutive-duplicates-v2 "Leeeeeerrroyyy")) "Leroy"))
    (is (= (remove-consecutive-duplicates-v2 [1 1 2 3 3 2 2 3]) '(1 2 3 2 3)))
    (is (= (remove-consecutive-duplicates-v2 [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))
    (is (= (remove-consecutive-duplicates-v2 []) []))))

