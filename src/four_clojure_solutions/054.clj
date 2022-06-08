(ns four-clojure-solutions.054)

;; https://4clojure.oxal.org/#/problem/054
;; Write a function which returns a sequence of lists of x items each.
;; Lists of less than x items should not be returned.
;; Restrictions: partition, partition-all

;;----------------------------------------------------------------------------

(defn partition-v1 [n coll]
  (lazy-seq
    (let [new-partition (take n coll)
          new-partition-length (count new-partition)
          remaining-elems (drop n coll)]
      (when (= new-partition-length n)
        (cons new-partition (partition-v1 n remaining-elems))))))

;;----------------------------------------------------------------------------

(comment
  (= (partition-v1 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
  (= (partition-v1 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
  (= (partition-v1 3 (range 8)) '((0 1 2) (3 4 5))))
