; 15. Double Down
; https://www.4clojure.com/problem/15
; Write a function which doubles a number.
;
; ����һ��������������һ�����ֵ� 2 ��
;
; (= (__ 2) 4)
; (= (__ 3) 6)
; (= (__ 11) 22)

; �ⷨ1.������
(fn [x] (* x 2))

; �ⷨ2.��ɧ��
#(* % 2)