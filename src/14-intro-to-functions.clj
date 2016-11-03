; 14. Intro to Functions
; https://www.4clojure.com/problem/14
; Clojure has many different ways to create functions.
;
; Clojure 有多种方法来创建自己的函数，详见题目：
;
; (= __ ((fn add-five [x] (+ x 5)) 3))
; (= __ ((fn [x] (+ x 5)) 3))
; (= __ (#(+ % 5) 3))
; (= __ ((partial + 5) 3))

8

; 个人喜欢的方式：(defn say-hi [name] (println "Hi!" name))
; 定义命名一条龙，方便调用。重名定义，后者会覆盖前者。