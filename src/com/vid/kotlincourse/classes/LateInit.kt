package com.vid.kotlincourse.classes

interface Repository {
    fun getAll(): List<Customer>
}


class CustomerController() {

    // Tells compiler it will be initialized later on
    lateinit var repo: Repository

    fun index(): String {
        return repo.getAll().toString()
    }
}


fun main() {
    val customerController = CustomerController()
    customerController.index()
}