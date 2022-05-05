(ns four-clojure-solutions.037-test
  (:require [clojure.test :refer :all]))

(deftest problem-37-test
  (testing "re-seq"
    (is (= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce "))))))
