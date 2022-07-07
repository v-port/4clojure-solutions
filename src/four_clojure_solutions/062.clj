(ns four-clojure-solutions.062)

;; https://4clojure.oxal.org/#/problem/062
;; Re-implement iteration
;; Given a side effect free function f and an initial value x
;; write a function which returns an infinite lazy sequence of
;; x, (f x), (f (f x)), (f (f (f x))), etc.
;; Special restrictions: iterate

;;----------------------------------------------------------------------------

(defn iterate-v1 [f x]
  (lazy-seq
    (cons x (iterate-v1 f (f x)))))

;;----------------------------------------------------------------------------

(comment
  (= (take 5 (iterate-v1 #(* 2 %) 1)) [1 2 4 8 16])
  (= (take 100 (iterate-v1 inc 0)) (take 100 (range)))
  (= (take 9 (iterate-v1 #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3]))))
