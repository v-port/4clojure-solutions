(ns four-clojure-solutions.027-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.027 :refer :all]))

(deftest problem-027-test
  (testing "palindrome? function"
    ; problem tests
    (is (false? (palindrome? '(1 2 3 4 5))))
    (is (true? (palindrome? "racecar")))
    (is (true? (palindrome? '(\r \a \c \e \c \a \r))))
    (is (true? (palindrome? [:foo :bar :foo])))
    (is (true? (palindrome? '(1 1 3 3 1 1))))
    (is (false? (palindrome? '(:a :b :c))))
    ; more tests
    (is (true? (palindrome? [])))
    (is (true? (palindrome? [1])))
    (is (true? (palindrome? [1 1])))
    (is (true? (palindrome? [1 2 1])))))
