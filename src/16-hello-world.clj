; 16. Hello World
; https://www.4clojure.com/problem/16
; Write a function which returns a personalized greeting.
;
; 定义一个用来 say hello 的函数，获取一个字符串（名字），输出 "Hello, "+名字+"!"
;
; (= (__ "Jenn") "Hello, Jenn!")
; (= (__ "Rhea") "Hello, Rhea!")

#(format "Hello, %s!" %)