; 16. Hello World
; https://www.4clojure.com/problem/16
; Write a function which returns a personalized greeting.
;
; ����һ������ say hello �ĺ�������ȡһ���ַ��������֣������ "Hello, "+����+"!"
;
; (= (__ "Jenn") "Hello, Jenn!")
; (= (__ "Rhea") "Hello, Rhea!")

#(format "Hello, %s!" %)