(ns four-clojure-solutions.011-test
  (:require [clojure.test :refer :all]))

(deftest question-011-test
  (testing "conj on maps"
    (= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3]))))