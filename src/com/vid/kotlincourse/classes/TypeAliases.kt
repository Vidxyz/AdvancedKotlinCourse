package com.vid.kotlincourse.classes

import kotlin.properties.Delegates

// Not this keyword
typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email) {

    // Property change notification using delegates, pretty useful
    var dept: String by Delegates.observable("", {property, oldValue, newValue ->
        println("Property ${property.name} has changed from $oldValue to $newValue")
    })

    fun printName(string: Name) {

    }
}


fun main() {

    val emp = Employee("Vid", "email@eail.com")

    emp.printName("Potato")

    emp.dept = "Home Depot"
}

