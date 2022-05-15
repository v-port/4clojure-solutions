(ns four-clojure-solutions.041-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.041 :refer :all]))

(deftest problem-41-test
  (testing "dropping every n-th element from collection"
    ; problem tests
    (is (= (drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
    (is (= (drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e]))
    (is (= (drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6]))
    ; more tests
    (is (= (drop-every-nth nil 3) []))
    (is (= (take 10 (drop-every-nth (range) 4)) [0 1 2 4 5 6 8 9 10 12]))))
