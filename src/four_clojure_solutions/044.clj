(ns four-clojure-solutions.044)

; https://4clojure.oxal.org/#/problem/44
; Write a function which can rotate a sequence in either direction.

;---------------------------------------------

(defn rotate-sequence [n s]
  (let [size (count s)
        split-at-idx (mod n size)
        [s1 s2] (split-at split-at-idx s)]
    (concat s2 s1)))

;---------------------------------------------

(comment
  (= (rotate-sequence 2 [1 2 3 4 5]) '(3 4 5 1 2))
  (= (rotate-sequence -2 [1 2 3 4 5]) '(4 5 1 2 3))
  (= (rotate-sequence 6 [1 2 3 4 5]) '(2 3 4 5 1))
  (= (rotate-sequence 1 '(:a :b :c)) '(:b :c :a))
  (= (rotate-sequence -4 '(:a :b :c)) '(:c :a :b)))
