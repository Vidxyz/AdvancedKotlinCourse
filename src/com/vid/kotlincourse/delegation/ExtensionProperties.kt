package com.vid.kotlincourse.delegation


// Companion objects can also have extension properties
// No backing fields or init sections

val String.hasAmpersand: Boolean
    get() = this.contains("&")


fun main() {

    // Used this way
    println("Hello".hasAmpersand)
    println("Hello & Bye".hasAmpersand)
}