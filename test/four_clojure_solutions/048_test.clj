(ns four-clojure-solutions.048-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.048 :refer :all]))

(deftest problem-048-test
  (testing "some function"
    (is (= 6 (some #{2 7 6} [5 6 7 8])))
    (is (= 6 (some #(when (even? %) %) [5 6 7 8])))
    (is (some even? [1 2 3 4]))
    (is (nil? (some even? [1 3])))))
