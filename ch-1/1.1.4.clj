

; Function Declarations
; (defn <name> [<formal parameters>]
;       <body>)

(defn square [x]
    (* x x) )

(square 21)

(defn spread [x y z]
    (- (max x y z) (min x y z)))

;good
(spread 10 20 30)
;will fail mismatched args

;Lets redefine function to handle multiple kinds of arities
(defn spread
    ([x] x)
    ([x y] (- (max x y) (min x y)))
    ([x y z] (- (max x y z ) (min x y z))))

;Or we can do variadic args
;This case is different because we collect args as a sequence called nums
(defn spread [& nums]
    (- (apply max nums) (apply min nums)))

;Apply takes a function and seq and calls the func with elem in seq as args
(apply max [5 1 7 4])
;is the same exact thing as
(max 5 1 7 4)


