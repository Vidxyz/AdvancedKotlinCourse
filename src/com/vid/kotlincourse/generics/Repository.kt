package com.vid.kotlincourse.generics

import com.vid.kotlincourse.classes.Customer
import java.io.Serializable

open class Entity(val id: Int){}

// T is Any?
// or class Repo<T: Entitiy> { ... }
class Repository<T> where T: Entity {
    fun save(entity: T) {
        if(entity.id != 0) {
            // ....
        }
    }
}

// This is also doable
fun <T: Serializable> streamObject(obj: T) {

}

class CustomerEntity(id: Int): Entity(id) {

}


fun main() {
    val repo = Repository<CustomerEntity>();
}