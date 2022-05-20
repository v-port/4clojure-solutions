(ns four-clojure-solutions.043)

; https://4clojure.oxal.org/#/problem/43
; Write a function which reverses the interleave
; process into x number of subsequences.

;---------------------------------------------

(defn reverse-interleave-v1
  [col n]
  (for [i (range n)
        :let [start-from (drop i col)
              elems (take-nth n start-from)]]
    elems))

(defn reverse-interleave-v2
  [col n]
  (apply map list (partition n col)))

;---------------------------------------------

(comment

  ; example 1
  (reverse-interleave-v1 [10 11 12 13 14 15] 3)

  col = [10 11 12 13 14 15], n = 3
  i = 0 => (take-nth 3 [10 11 12 13 14 15]) => [10 13]
  i = 1 => (take-nth 3 [11 12 13 14 15]) => [11 14]
  i = 2 => (take-nth 3 [12 13 14 15]) => [12 15]
  => [[10 13] [11 14] [12 15]]

  ; example 2
  (reverse-interleave-v2 [10 11 12 13 14 15] 3)

  (partition 3 [10 11 12 13 14 15]) => [[10 11 12] [13 14 15]]
  (apply map vector [[10 11 12] [13 14 15]]) => [[10 13] [11 14] [12 15]]

  (= (reverse-interleave-v2 [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
  (= (reverse-interleave-v2 (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
  (= (reverse-interleave-v2 (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))
