
;Substituiton Model
;Take the body of function
; REplace formal param with value of args
(defn square [x]
    (* x x))
;(square 5)
;(* 5 5)
;>>25

;;;;
;Another Example
(defn f [a]
    (sum-of-squares (+ a 1) (* a 2)))

(defn sum-of-squares [x y]
    (+ (* x x) (* y y)))

;Evaluation would look like
(f 5)
(sum-of-squares (+ a 1) (* a 2))
(sum-of-squares (+ 5 1) (* 5 2))
(+ (square 6) (square 10))
(+ (* 6 6) (* 10 10))
(+ 36 100)
;>>136

;This method only works for pure functions
;The interpreter evaluates the operatior and operands
; Then we apply resulting functions to resulting args


;Normal order evaluation would look like
(sum-of-squares (+ 5 1) (* 5 2))
(+ (square (+ 5 1)) (square (* 5 2)))
(+ (* (+ 5 1) (+ 5 1)) (* (* 5 2) (* 5 2)))
(+ (* 6 6) (* 10 10))
(+ 36 100)
;>>136
