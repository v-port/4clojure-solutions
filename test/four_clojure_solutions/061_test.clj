(ns four-clojure-solutions.061-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.061 :refer :all]))

(deftest problem-061-test
  (testing "alternative zipmap"
    ; problem tests
    (is (= (zipmap-v1 [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}))
    (is (= (zipmap-v1 [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}))
    (is (= (zipmap-v1 [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"}))
    ; more tests
    (is (= (zipmap-v1 [:a :b :c] (range)) {:a 0, :b 1, :c 2}))
    (is (= (zipmap-v1 [:a :b :c] []) {}))))
