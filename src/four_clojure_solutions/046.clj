(ns four-clojure-solutions.046)

; https://4clojure.oxal.org/#/problem/046
; Write a higher-order function which flips the order of
; the arguments of an input function.

;---------------------------------------------

(defn flip-args [f]
  (fn [& args]
    (apply f (reverse args))))

;---------------------------------------------

(comment
  (= 3 ((flip-args nth) 2 [1 2 3 4 5]))
  (= true ((flip-args >) 7 8))
  (= 4 ((flip-args quot) 2 8))
  (= [1 2 3] ((flip-args take) [1 2 3 4 5] 3)))
