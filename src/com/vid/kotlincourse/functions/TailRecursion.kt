package com.vid.kotlincourse.functions

// Need to explicity mark
tailrec fun factorial(number: Int, acc: Int = 1): Int {
    when(number) {
        0, 1 -> return 1
        else -> return factorial(number - 1, acc * number)
    }
}

fun main() {
    factorial(5)
}