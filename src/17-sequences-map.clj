; 17. Sequences: map
; https://www.4clojure.com/problem/17
; The map function takes two arguments: a function (f) and a sequence
; (s).  Map returns a new sequence consisting of the result of applying
; f to each item of s.  Do not confuse the map function with the map
; data structure.
;
; Map 函数有两个参数：第一个参数是函数，第二个参数是一个序列。Map 函数会
; 返回一个新的序列，而这个新序列的元素是由参数2序列中的元素从左依次通过
; 参数1函数计算得来的。注意不要混淆了 Map 函数和 Map 数据结构哦~
;
; (= __ (map #(+ % 5) '(1 2 3)))

'(6 7 8)