(ns four-clojure-solutions.049-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.049 :refer :all]))

(deftest problem-049-test
  (testing "alternative split-at"
    ; problem tests
    (is (= (split-at-v1 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
    (is (= (split-at-v1 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
    (is (= (split-at-v1 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))
    ; more tests
    (is (split-at-v1 2 [0 1 2 3]) [[0 1] [2 3]])
    (is (split-at-v1 -2 [0 1 2 3]) [[] [1 2 3 4]])
    (is (split-at-v1 2 nil) [[] []])
    (is (split-at-v1 2 []) [[] []])))
