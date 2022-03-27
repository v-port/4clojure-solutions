(ns four-clojure-solutions.014-test
  (:require [clojure.test :refer :all]))

(deftest question-014-test
  (testing "function creation"
    (= 8 ((fn add-five [x] (+ x 5)) 3))
    (= 8 ((fn [x] (+ x 5)) 3))
    (= 8 (#(+ % 5) 3))
    (= 8 ((partial + 5) 3))))
