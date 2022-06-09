(ns four-clojure-solutions.055)

;; https://4clojure.oxal.org/#/problem/055
;; Write a function which returns a map containing the number
;; of occurrences of each distinct item in a sequence.
;; Restrictions: frequencies

;;----------------------------------------------------------------------------

(defn frequencies-v1
  [coll]
  (reduce (fn [acc x]
            (let [current-count (get acc x 0)]
              (assoc acc x (inc current-count))))
          {}
          coll))

(defn frequencies-v2
  [coll]
  (if (empty? coll)
    {}
    (apply merge-with
           +
           (for [x coll] {x 1}))))

;;----------------------------------------------------------------------------

(comment
  (= (frequencies-v1 [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
  (= (frequencies-v1 [:b :a :b :a :b]) {:a 2, :b 3})
  (= (frequencies-v1 '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})

  (= (frequencies-v2 [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
  (= (frequencies-v2 [:b :a :b :a :b]) {:a 2, :b 3})
  (= (frequencies-v2 '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))
