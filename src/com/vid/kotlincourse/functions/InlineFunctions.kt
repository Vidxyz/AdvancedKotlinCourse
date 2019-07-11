package com.vid.kotlincourse.functions

import java.lang.Exception

// Instead of invoking, it copies and pastes it in there
// Side effect is that code becomes long
inline fun nonOp(x: Int) {

}

inline fun operation2(noinline op: () -> Unit, op2: (Int) -> Int) {
    println("Before op")
    op()
    // Compiler shows two places to view stackTrace
    throw Exception("Inline exception")
    println("After op")
}


inline fun tryingToInline(noinline op: () -> Unit) {
    val ref = op
    println("Assigned value")
    op()
}

// Makes a HOF inline, copies code
inline fun operation(op: () -> Unit) {
    println("Before op")
    op()
    println("After op")
}

fun anotherFunc() {
    operation { println("This is the actual op function") }
}


fun main() {

    operation { println("This is the actual op function") }

}