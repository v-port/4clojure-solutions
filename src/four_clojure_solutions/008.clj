(ns four-clojure-solutions.008)

;https://4clojure.oxal.org/#/problem/8

;---------------------------------------------

(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))