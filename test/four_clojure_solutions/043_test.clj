(ns four-clojure-solutions.043-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.043 :refer :all]))

(deftest problem-043-test
  (testing "reverse interleave"
    (is (= (reverse-interleave-v2 [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))
    (is (= (reverse-interleave-v2 (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))
    (is (= (reverse-interleave-v2 (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))))
