package com.vid.kotlincourse.functions

fun containingFunction() {
    val numbers = 1..100
    numbers.forEach myLabel@ {
        if(it % 5 == 0) {
            // Can also you @function_name
            return@myLabel
            // Return NOT allowed if function is BOT inline
        }
        else {
            println("Shit")
        }
    }
    // Not run, because return returns from containing function
    println("Hello")
}


fun f1() {
    val numbers = 1..100

    // Local functions to local returns
    // returns are done to closet 'fun' keyboard. Lambdas dont have that
    numbers.forEach(fun (e) {
        if(e%5 == 0) {
            return
        }
    })
    println("Hello")
}

fun main() {
    containingFunction()
}