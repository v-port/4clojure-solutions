(ns four-clojure-solutions.006-test
  (:require [clojure.test :refer :all]))

(deftest question-006-test
  (testing "vectors and lists equality"
    (is (= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))))
