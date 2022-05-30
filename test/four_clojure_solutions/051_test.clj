(ns four-clojure-solutions.051-test
  (:require [clojure.test :refer :all]))

(deftest problem-051-test
  (testing "sequence destructuring"
    (is (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] [1 2 3 4 5]] [a b c d])))))
