(ns four-clojure-solutions.016)

;https://4clojure.oxal.org/#/problem/16

;---------------------------------------------

(= (#(str "Hello, " % "!") "Dave") "Hello, Dave!")
(= (#(str "Hello, " % "!") "Jenn") "Hello, Jenn!")
(= (#(str "Hello, " % "!") "Rhea") "Hello, Rhea!")
