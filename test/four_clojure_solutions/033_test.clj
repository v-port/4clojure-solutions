(ns four-clojure-solutions.033-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.033 :refer :all]))

;---------------------------------------------

(deftest problem-033-test
  (testing "replicate elements function"
    ; problem tests
    (is (= (replicate-elems-v2 [1 2 3] 2) '(1 1 2 2 3 3)))
    (is (= (replicate-elems-v2 [:a :b] 4) '(:a :a :a :a :b :b :b :b)))
    (is (= (replicate-elems-v2 [4 5 6] 1) '(4 5 6)))
    (is (= (replicate-elems-v2 [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4])))
    (is (= (replicate-elems-v2 [44 33] 2) [44 44 33 33]))
    ; more tests
    (is (= (take 10 (replicate-elems-v2 (range) 2)) [0 0 1 1 2 2 3 3 4 4]))
    (is (= (replicate-elems-v2 [] 5) []))))
