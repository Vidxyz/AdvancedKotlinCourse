package com.vid.kotlincourse.delegation

import com.vid.kotlincourse.classes.Customer

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

interface Logger {
    fun logAll()
}


// Delegation syntax
// Don't pass in too many dependencies
class Controller(repository: Repository, logger: Logger): Repository by repository, Logger by logger {

    fun index(): String {
        getAll()
        getById(3)

        logAll()

        return "tst"
    }

}