package com.vid.kotlincourse.functions

infix fun String.shouldBeEqualTo(value: String) = this == value


fun main() {

    "Hello".shouldBeEqualTo("Hello")

    val output = "hello"
    // ONLY for single parameter functions
    output shouldBeEqualTo "Hello"

}