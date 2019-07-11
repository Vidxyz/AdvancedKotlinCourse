package com.vid.kotlincourse.functions

fun foo(fooParam: String) {

    val outerFunction = "Value"

    // Local function, has access to both values
    fun bar(barParam: String) {
        println(barParam)
        println(fooParam)
        println(outerFunction)
    }

}


fun main() {
    foo("Some Value")


}