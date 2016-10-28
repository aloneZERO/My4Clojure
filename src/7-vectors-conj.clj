; 7.Vectors: conj
; http://www.4clojure.com/problem/7
; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.
;
; 题目解析: 与操作表相同的函数 conj，对于操作 vector 会将一个或多个元素添加到原 vector "尾" 并返回这个 new vector。
;	conj 函数并不是把元素添加到表头位置，它只能保证以最快的速度添加进一种数据结构。
;
; (= __ (conj [1 2 3] 4))
; (= __ (conj [1 2] 3 4))

[1 2 3 4]