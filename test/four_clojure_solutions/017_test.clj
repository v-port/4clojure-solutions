(ns four-clojure-solutions.017-test
  (:require [clojure.test :refer :all]))

(deftest question-017-test
  (testing "map function"
    (= '(6 7 8) (map #(+ % 5) '(1 2 3)))
    (= '() (map #(+ % 5) '()))))
