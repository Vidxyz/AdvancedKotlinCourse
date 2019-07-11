package com.vid.kotlincourse.functions

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}


fun main() {

    op(3, {it * it})

    // Anonymous function
    // Differences:-
    // 1. Explicit Return type
    // 2. Multiple return statements are possible
    op(3, fun(x: Int):Int {
        if (x > 10) return 0
        else return x * x })
    op(3, fun(x: Int) =  x * x )

}