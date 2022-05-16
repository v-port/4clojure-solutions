(ns four-clojure-solutions.042-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.042 :refer :all]))

(deftest problem-42-test
  (testing "factorial function"
    (is (= (factorial-v2 -1) nil))
    (is (= (factorial-v2 0) 1))
    (is (= (factorial-v2 1) 1))
    (is (= (factorial-v2 2) 2))
    (is (= (factorial-v2 3) 6))
    (is (= (factorial-v2 4) 24))
    (is (= (factorial-v2 5) 120))
    (is (= (factorial-v2 6) 720))
    (is (= (factorial-v2 7) 5040))
    (is (= (factorial-v2 8) 40320))
    (is (= (factorial-v2 9) 362880))
    (is (= (factorial-v2 10) 3628800))
    (is (= (factorial-v2 60) 8320987112741390144276341183223364380754172606361245952449277696409600000000000000N))))
