(ns four-clojure-solutions.052-test
  (:require [clojure.test :refer :all]))

(deftest problem-052-test
  (testing "let bindings destructuring"
    (is (= [2 4] (let [[a b c d e f g] (range)] [c e])))))
