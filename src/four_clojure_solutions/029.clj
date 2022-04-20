(ns four-clojure-solutions.029)

; https://4clojure.oxal.org/#/problem/29
; Write a function which takes a string and returns a
; new string containing only the capital letters.

;---------------------------------------------

(defn filter-uppercase-v1 [s]
  (reduce str (filter #(Character/isUpperCase %) s)))


(defn filter-uppercase-v2 [s]
  (reduce str (re-seq #"[A-Z]" s)))

;---------------------------------------------

(comment
  (= (filter-uppercase-v2 "HeLlO, WoRlD!") "HLOWRD")
  (empty? (filter-uppercase-v2 "nothing"))
  (= (filter-uppercase-v2 "$#A(*&987Zf") "AZ"))
