(ns four-clojure-solutions.061)

;; https://4clojure.oxal.org/#/problem/061
;; Write a function which takes a vector of keys and a vector of values
;; and constructs a map from them.
;; Restrictions: zipmap

;;----------------------------------------------------------------------------

(defn zipmap-v1
  [keys values]
  (apply
    hash-map
    (interleave keys values)))

;;----------------------------------------------------------------------------

(comment
  (= (zipmap-v1 [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
  (= (zipmap-v1 [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
  (= (zipmap-v1 [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"}))
