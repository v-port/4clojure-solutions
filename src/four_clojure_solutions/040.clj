(ns four-clojure-solutions.040)

; https://4clojure.oxal.org/#/problem/40
; Write a function which separates the items of
; a sequence by an arbitrary value.
; Restrictions - interpose

;---------------------------------------------

(defn interpose-v1 [sep coll]
  (rest (interleave (repeat sep) coll)))

;---------------------------------------------

(comment
  (= (interpose-v1 0 [1 2 3]) [1 0 2 0 3])
  (= (apply str (interpose-v1 ", " ["one" "two" "three"])) "one, two, three")
  (= (interpose-v1 :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))
