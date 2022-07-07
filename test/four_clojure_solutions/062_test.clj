(ns four-clojure-solutions.062-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.062 :refer :all]))

(deftest problem-062-test
  (testing "alternative iterate"
    (is (= (take 5 (iterate-v1 #(* 2 %) 1)) [1 2 4 8 16]))
    (is (= (take 100 (iterate-v1 inc 0)) (take 100 (range))))
    (is (= (take 9 (iterate-v1 #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3]))))))
