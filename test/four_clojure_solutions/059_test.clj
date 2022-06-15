(ns four-clojure-solutions.059-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.059 :refer :all]))

(deftest problem-059-test
  (testing "alternative juxt function"
    (is (= [21 6 1] ((juxt-v1 + max min) 2 3 5 1 6 4)))
    (is (= ["HELLO" 5] ((juxt-v1 #(.toUpperCase %) count) "hello")))
    (is (= [2 6 4] ((juxt-v1 :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10})))))
