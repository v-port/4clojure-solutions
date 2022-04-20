(ns four-clojure-solutions.029-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.029 :refer :all]))

(deftest problem-029-test
  (testing "filter uppercase function"
    ; problem tests
    (is (= (filter-uppercase-v2 "HeLlO, WoRlD!") "HLOWRD"))
    (is (empty? (filter-uppercase-v2 "nothing")))
    (is (= (filter-uppercase-v2 "$#A(*&987Zf") "AZ"))
    ; more tests
    (is (= (filter-uppercase-v1 "") ""))
    (is (= (filter-uppercase-v1 nil) ""))))
