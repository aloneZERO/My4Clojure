; 15. Double Down
; https://www.4clojure.com/problem/15
; Write a function which doubles a number.
;
; 创建一个函数用来计算一个数字的 2 倍
;
; (= (__ 2) 4)
; (= (__ 3) 6)
; (= (__ 11) 22)

; 解法1.正常型
(fn [x] (* x 2))

; 解法2.风骚型
#(* % 2)