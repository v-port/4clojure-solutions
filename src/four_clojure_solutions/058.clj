(ns  four-clojure-solutions.058)

;; https://4clojure.oxal.org/#/problem/058
;; Write a function which allows you to create function compositions.
;; The parameter list should take a variable number of functions,
;; and create a function applies them from right-to-left.
;; Restrictions: comp

;;----------------------------------------------------------------------------

(defn comp-v1 [& fs]
  (let [[first-f & rest-fs] (reverse fs)]
    (fn [& args]
      (reduce
        (fn [acc f] (f acc))
        (apply first-f args)
        rest-fs))))

;;----------------------------------------------------------------------------

(comment
  (= [3 2 1] ((comp-v1 rest reverse) [1 2 3 4]))
  (= 5 ((comp-v1 (partial + 3) second) [1 2 3 4]))
  (= true ((comp-v1 zero? #(mod % 8) +) 3 5 7 9))
  (= "HELLO" ((comp-v1 #(.toUpperCase %) #(apply str %) take) 5 "hello world")))
