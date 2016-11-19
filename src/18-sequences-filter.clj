; 18. Sequences: filter
; https://www.4clojure.com/problem/18
; The filter function takes two arguments: a predicate function (f) and
; a sequence (s).  Filter returns a new sequence consisting of all the
; items of s for which (f item) returns true.
;
; filter 函数有两个参数：第一个参数是一个用来判断某个条件的函数；第二个参数
; 是一个序列。Filter 函数会返回一个新的序列，新序列的元素由参数2序列中所有使
; 参数1函数返回 true 的元素组成。
;
; (= __ (filter #(> % 5) '(3 4 5 6 7)))

'(6 7)