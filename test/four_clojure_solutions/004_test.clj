(ns four-clojure-solutions.004-test
  (:require [clojure.test :refer :all]))

(deftest question-004-test
  (testing "list construction"
    (is (= (list :a :b :c) '(:a :b :c)))))
