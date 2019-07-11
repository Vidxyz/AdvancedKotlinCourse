package com.vid.kotlincourse.generics

import com.vid.kotlincourse.classes.Customer

open class Person

class Employee: Person() {

}


fun operator(person: List<Person>) {

}


// Covariance is now respected
//values are passed OUT (not in)
interface RORepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}

// Declaration site variance
// Contravariance, opposite of covariance (not the intuitive scenario this)
interface WriteRepot<in T> {
    fun save(obj:T )
    fun saveAll(list: List<T>)
}


fun main() {
    operator(listOf<Employee>())
    operator(listOf<Person>())

    val ro = RORepoImpl<Customer>()

    ro.getAll()
}