; 14. Intro to Functions
; https://www.4clojure.com/problem/14
; Clojure has many different ways to create functions.
;
; Clojure �ж��ַ����������Լ��ĺ����������Ŀ��
;
; (= __ ((fn add-five [x] (+ x 5)) 3))
; (= __ ((fn [x] (+ x 5)) 3))
; (= __ (#(+ % 5) 3))
; (= __ ((partial + 5) 3))

8

; ����ϲ���ķ�ʽ��(defn say-hi [name] (println "Hi!" name))
; ��������һ������������á��������壬���߻Ḳ��ǰ�ߡ�