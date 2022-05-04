(ns four-clojure-solutions.036-test
  (:require [clojure.test :refer :all]))

(deftest problem-36-test
  (testing "multi variable let"
    (is (= 10 (let [x 7 y 3 z 1] (+ x y))))
    (is (= 4 (let [x 7 y 3 z 1] (+ y z))))
    (is (= 1 (let [x 7 y 3 z 1] z)))))
