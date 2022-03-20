(ns four-clojure-solutions.009-test
  (:require [clojure.test :refer :all]))

(deftest question-009-test
  (testing "conj on sets"
    (is (= #{1 2 3 4} (conj #{1 4 3} 2)))))