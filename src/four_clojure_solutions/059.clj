(ns four-clojure-solutions.059)

;; https://4clojure.oxal.org/#/problem/059
;; Take a set of functions and return a new function that takes
;; a variable number of arguments and returns a sequence containing the
;; result of applying each function left-to-right to the argument list.
;; Restrictions - juxt

;;----------------------------------------------------------------------------

(defn juxt-v1
  [& fns]
  (fn [& args]
    (for [f fns] (apply f args))))

;;----------------------------------------------------------------------------

(comment
  (= [21 6 1] ((juxt-v1 + max min) 2 3 5 1 6 4))
  (= ["HELLO" 5] ((juxt-v1 #(.toUpperCase %) count) "hello"))
  (= [2 6 4] ((juxt-v1 :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10})))
