package com.vid.kotlincourse.generics

import com.vid.kotlincourse.classes.Customer

open class Person

class Employee: Person() {

}


fun operator(person: List<Person>) {

}


// Covariance is now respected
interface RORepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}




fun main() {
    operator(listOf<Employee>())
    operator(listOf<Person>())

    val ro = RORepoImpl<Customer>()

    ro.getAll()
}