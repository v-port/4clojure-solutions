(ns four-clojure-solutions.055-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.055 :refer :all]))

(deftest problem-055-test
  (testing "alternative frequencies function"
    ; problem tests
    (is (= (frequencies-v2 [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
    (is (= (frequencies-v2 [:b :a :b :a :b]) {:a 2, :b 3}))
    (is (= (frequencies-v2 '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))
    ; more tests
    (is (= (frequencies-v2 nil) {}))
    (is (= (frequencies-v2 []) {}))
    (is (= (frequencies-v2 [:a]) {:a 1}))
    (is (= (frequencies-v2 [:a :b :a]) {:a 2 :b 1}))))
