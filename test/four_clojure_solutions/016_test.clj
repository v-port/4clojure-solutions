(ns four-clojure-solutions.016-test
  (:require [clojure.test :refer :all]))

(deftest question-016-test
  (testing "personalised greeting function"
    (is (= (#(str "Hello, " % "!") "Dave") "Hello, Dave!"))
    (is (= (#(str "Hello, " % "!") "Jenn") "Hello, Jenn!"))
    (is (= (#(str "Hello, " % "!") "Rhea") "Hello, Rhea!"))))
