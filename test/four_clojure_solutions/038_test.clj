(ns four-clojure-solutions.038-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.038 :refer :all]))

(deftest problem-38-test
  (testing "alternative max function"
    ; problem tests
    (is (= (max-v2 1 8 3 4) 8))
    (is (= (max-v2 30 20) 30))
    (is (= (max-v2 45 67 11) 67))
    ; more tests
    (is (= (max-v2 1) 1))
    (is (= (max-v2 2 1) 2))
    (is (= (max-v2 2 3 1) 3))
    (is (= (max-v2 2 3 1 4) 4))))
