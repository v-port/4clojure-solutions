(ns for-clojure-solutions.003-test
  (:require [clojure.test :refer :all]))

(deftest question-003-test
  (testing "Clojure strings are Java strings"
    (is (= "HELLO WORLD" (.toUpperCase "hello world")))))
