(ns four-clojure-solutions.028)

; https://4clojure.oxal.org/#/problem/28
; Write a function which flattens a sequence.
; Restriction - flatten

;---------------------------------------------

(defn flatten-v1 [col]
  (if (empty? col)
    col
    (let [x (first col) flattened-tail (flatten-v1 (rest col))]
      (if (coll? x)
        (concat (flatten-v1 x) flattened-tail)
        (cons x flattened-tail)))))

(defn flatten-v2 [col]
  (if (coll? col)
    (reduce concat (map flatten-v2 col))
    (list col)))

;---------------------------------------------

(comment
  (= (flatten-v2 '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
  (= (flatten-v2 ["a" ["b"] "c"]) '("a" "b" "c"))
  (= (flatten-v2 '((((:a))))) '(:a)))
