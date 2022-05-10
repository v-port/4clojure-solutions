(ns four-clojure-solutions.040-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.040 :refer :all]))

(deftest problem-40-test
  (testing "alternative interpose function"
    ; problem tests
    (is (= (interpose-v1 0 [1 2 3]) [1 0 2 0 3]))
    (is (= (apply str (interpose-v1 ", " ["one" "two" "three"])) "one, two, three"))
    (is (= (interpose-v1 :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))
    ; more tests
    (is (= (take 6 (interpose-v1 "-" (range))) '(0 "-" 1 "-" 2 "-")))
    (is (= (interpose-v1 "-" (range 6)) '(0 "-" 1 "-" 2 "-" 3 "-" 4 "-" 5)))))
