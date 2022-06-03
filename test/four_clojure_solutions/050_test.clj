(ns four-clojure-solutions.050-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.050 :refer :all]))

(deftest problem-050-test
  (testing "splitting sequence by type"
    (is (= (set (split-seq-by-type [])) #{}))
    (is (= (set (split-seq-by-type [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]}))
    (is (= (set (split-seq-by-type [:a "foo" "bar" :b])) #{[:a :b] ["foo" "bar"]}))
    (is (= (set (split-seq-by-type [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]}))))
