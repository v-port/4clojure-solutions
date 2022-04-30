(ns four-clojure-solutions.035-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.035 :refer :all]))

(deftest problem-035-test
  (testing "usage of let"
    (is (= 7 (let [x 5] (+ 2 x))))
    (is (= 7 (let [x 3, y 10] (- y x))))
    (is (= 7 (let [x 21] (let [y 3] (/ x y)))))))
