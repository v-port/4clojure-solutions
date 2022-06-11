(ns four-clojure-solutions.056)

;; https://4clojure.oxal.org/#/problem/056
;; Write a function which removes the duplicates from a sequence.
;; Order of the items must be maintained.
;; Restrictions: distinct

;;----------------------------------------------------------------------------

(defn distinct-v1 [coll]
  (loop [c coll acc []]
    (if (empty? c)
      acc
      (let [x (first c)
            new-acc (if (some #{x} acc)
                      acc
                      (conj acc x))]
        (recur (rest c) new-acc)))))

(defn distinct-v1-lazy [xs]
  (lazy-seq
    (if-let [[x & xs] (seq xs)]
      (cons x (remove #{x} (distinct-v1-lazy xs))))))

;;----------------------------------------------------------------------------

(comment
  (= (distinct-v1 [1 2 1 3 1 2 4]) [1 2 3 4])
  (= (distinct-v1 [:a :a :b :b :c :c]) [:a :b :c])
  (= (distinct-v1 '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
  (= (distinct-v1 (range 50)) (range 50)))
