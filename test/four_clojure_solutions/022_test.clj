(ns four-clojure-solutions.022-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.022 :refer :all]))

(deftest question-022-test
  (testing "alternative count function"
    ; problem tests
    (is (= (count-v3 "Hello World") 11))
    (is (= (count-v3 '(1 2 3 3 1)) 5))
    (is (= (count-v3 [[1 2] [3 4] [5 6]]) 3))
    (is (= (count-v3 '(13)) 1))
    (is (= (count-v3 '(:a :b :c)) 3))
    ; more tests
    (is (= (count-v3 []) 0))
    (is (= (count-v3 nil) 0))))
