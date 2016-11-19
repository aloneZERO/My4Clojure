; 21. Nth Element
; https://www.4clojure.com/problem/21
; Write a function which returns the Nth element from a sequence.
;
; 创建一个返回值为参数序列指定索引上的元素的函数。
; 特殊限制：禁止使用 nth 函数!
;
; (= (__ '(4 5 6 7) 2) 6)
; (= (__ [:a :b :c] 0) :a)
; (= (__ [1 2 3 4] 1) 2)
; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

(fn [coll index]
	(last (take (+ index 1) coll))) ; take 函数返回前 (index+1) 项元素组成的序列
	                                ; 此时最后一个元素即为结果