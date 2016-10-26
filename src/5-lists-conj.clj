; 5.Lists: conj
; http://www.4clojure.com/problem/5
; When operating on a list, the conj function will return a new list with one or more items "added" to the front.
; Note that there are two test cases, but you are expected to supply only one answer, which will cause all the tests to pass.
;
; 题目解析：当你操作这个列表时，conj 函数将新的一个或多个元素 "添加" 到原表头并返回这个新表，
;	注意此时原表并没有被改变，conj 函数是没有副作用的；conj 函数并不是把元素添加到表头位置，
;	它只能保证以最快的速度添加进一种数据结构。
;
; 两段问题代码的答案是一样的
; (= __ (conj '(2 3 4) 1))
; (= __ (conj '(3 4) 2 1))

; 解法.1
(list 1 2 3 4)

; 解法.2
'(1 2 3 4)