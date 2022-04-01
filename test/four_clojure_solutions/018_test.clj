(ns four-clojure-solutions.018-test
  (:require [clojure.test :refer :all]))

(deftest question-018-test
  (testing "filter function"
    (is (= '(6 7) (filter #(> % 5) '(3 4 5 6 7))))))
