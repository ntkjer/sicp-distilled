;1.1
10
>>10
(+ 5 3 4)
>>12
(- 9 1)
>>8
(/ 6 2)
>>3
(+ (* 2 4) (- 4 6))
>>(+ (8) (-2))
>>6
(def a 3)
>>#a/3
(def b (+ a 1))
>>4
(+ a b (* a b))
>>19
(= a b)
>> false
(if (and (> b a) (< b (* a b)))
  b
  a)
>>b a
>>4 3
(cond (= a 4) 6
      (= b 4) (+ 6 7 a)
      :else 25)
>>16
(+ 2 (if (> b a) b a))
>>9
(* (cond (> a b) a
         (< a b) b
         :else -1)
   (+ a 1))
>>16

;1.2
(/
    (+ 5(+ 4 (- 2 (- 3 (+ 6 (/ 4 5))))))
    (* 3 (* (- 6 2) (- 2 7))))

;1.3
(defn gt-sumofsquares [a b c]
;if a > b, b > c
; a > b, b < c
; a < b , b < c
; a > b , b < c

    )
