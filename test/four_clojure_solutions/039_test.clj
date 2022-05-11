(ns four-clojure-solutions.039-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.039 :refer :all]))

(deftest problem-39-test
  (testing "alternative interleave function"
    ; problem tests
    (is (= (interleave-v3 [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
    (is (= (interleave-v3 [1 2] [3 4 5 6]) '(1 3 2 4)))
    (is (= (interleave-v3 [1 2 3 4] [5]) [1 5]))
    (is (= (interleave-v3 [30 20] [25 15]) [30 25 20 15]))
    ; more tests
    (is (= (interleave-v3 [] [1 2 3]) []))
    (is (= (interleave-v3 nil [1 2 3]) []))
    (is (= (interleave-v3 [1 2 3] nil) []))
    (is (= (interleave-v3 (range) [:a :b :c]) [0 :a 1 :b 2 :c]))
    (is (= (interleave-v3 [:a :b :c] (range)) [:a 0 :b 1 :c 2]))))
