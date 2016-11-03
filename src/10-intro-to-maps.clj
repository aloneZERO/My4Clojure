; 10.Intro to maps
; http://www.4clojure.com/problem/10
; Maps store key-value pairs. Both maps and keywords can be used as lookup functions.
; Commas can be used to make maps more readable, but they are not required.
;
; Map 是一种存储键值对的数据结果，它更符合我在解决生活问题时对数据的存储需求。比如：通讯录，字典等等。
; 知道了 key 就可拿到对应的 value，可理解为语义化的索引。掌握它去完成更多有趣的操作吧。
; 小说明：逗号可以让定义的map具有更好的可读性，但它不是必须的~
;
; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
; (= __ (:b {:a 10, :b 20, :c 30}))

20

; 注意：定义 Map 可以使用 hash-map 函数，或者 {:a 1,:b 2}。
; 而 map 函数不是用来定义 map 的，它的功能类似于 forEach，请看示例：
; (defn add-one [x] (+ 1 x)) ; 定义一个数值加一的函数
; (map add-one (1 2 3)) ; 输出结果：(2 3 4)