(ns four-clojure-solutions.027)

; https://4clojure.oxal.org/#/problem/27
; Write a function which returns true if the given sequence is a palindrome.
; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

;---------------------------------------------

(defn palindrome?
  [col]
  (or
    (empty? col)
    (= (seq col) (reverse col))))

;---------------------------------------------

(false? (palindrome? '(1 2 3 4 5)))
(true? (palindrome? "racecar"))
(true? (palindrome? [:foo :bar :foo]))
(true? (palindrome? '(1 1 3 3 1 1)))
(false? (palindrome? '(:a :b :c)))
