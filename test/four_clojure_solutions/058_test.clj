(ns  four-clojure-solutions.058-test
  (:require [clojure.test :refer :all]
            [ four-clojure-solutions.058 :refer :all]))

(deftest problem-058-test
  (testing "alternative comp function"
    (is (= [3 2 1] ((comp-v1 rest reverse) [1 2 3 4])))
    (is (= 5 ((comp-v1 (partial + 3) second) [1 2 3 4])))
    (is (= true ((comp-v1 zero? #(mod % 8) +) 3 5 7 9)))
    (is (= "HELLO" ((comp-v1 #(.toUpperCase %) #(apply str %) take) 5 "hello world")))))
