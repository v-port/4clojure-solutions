(ns four-clojure-solutions.041)

; https://4clojure.oxal.org/#/problem/41
; Write a function which drops every nth item from a sequence.

;---------------------------------------------

(defn drop-every-nth [coll n]
  (->> coll
       (partition-all n)
       (mapcat #(if (= (count %) n)
                  (butlast %)
                  %))))

;---------------------------------------------

(comment
  (= (drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
  (= (drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e])
  (= (drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6]))
