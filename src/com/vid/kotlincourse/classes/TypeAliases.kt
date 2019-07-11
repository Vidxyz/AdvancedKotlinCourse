package com.vid.kotlincourse.classes

// Not this keyword
typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email) {
    fun printName(string: Name) {

    }
}


fun main() {

    val emp = Employee("Vid", "email@eail.com")

    emp.printName("Potato")
}

