(ns four-clojure-solutions.008-test
  (:require [clojure.test :refer :all]
            [clojure.set :as s]))

(deftest question-008-test
  (testing "set operations"
    (is (= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d))))
    (is (= #{:a :b :c :d} (s/union #{:a :b :c} #{:b :c :d})))))