; 20. Penultimate Element
; https://www.4clojure.com/problem/20
; Write a function which returns the second to last element from a
; sequence.
;
; 创建一个返回值为目标序列倒数第二个元素的函数
; 
; (= (__ (list 1 2 3 4 5)) 4)
; (= (_ ["a" "b" "c"]) "b")
; (= (__ [[1 2] [3 4]]) [1 2])

; 解法.1
#(second (reverse %))

; 解法.2
(comp first rest reverse) ; 翻转序列->除首元素以为的元素组成的序列->取第一个元素，即原序列倒数第二个
; 关于 comp 函数:
; Clojure v1.8 API documention：http://clojure.github.io/clojure/clojure.core-api.html#clojure.core/comp
; 汉化版：http://clojure-api-cn.readthedocs.io/en/latest/clojure.core/comp.html 