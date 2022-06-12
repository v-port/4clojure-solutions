(ns  four-clojure-solutions.057-test
  (:require [clojure.test :refer :all]))

(deftest problem-057-test
  (testing "simple restructuring"
    (is (= [5 4 3 2 1] ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)))))
