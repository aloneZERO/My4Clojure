; 19. Last Element
; https://www.4clojure.com/problem/19
; Write a function which returns the last element in a sequence.
; Special Restrictions: last!
;
; 创建一个返回值为序列最后一个元素的函数。
; 特殊限制：不允许使用 last 函数！
; 这道题考察的重点是序列操作的核心函数的运用。
;
; (= (__ [1 2 3 4 5]) 5)
; (= (__ '(5 4 3)) 3)
; (= (__ ["b" "c" "d"]) "d")

#(first (reverse %)) ; 翻转目标序列，然后取其新序列的第一个元素，即原序列的最后一个元素