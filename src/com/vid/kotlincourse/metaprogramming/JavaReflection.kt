package com.vid.kotlincourse.metaprogramming

import java.lang.reflect.Type

class Transaction(val id: Int, val amount: Double, var description: String = "") {

    fun validate() {
        if(amount > 10000) {
            println("Transaction too large")
        }
    }

}


fun introspectInstance(obj: Any) {
    println("Class ${obj.javaClass.simpleName}")
    println("Properties \n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type ${it.type}")
    }
    println("Functions \n")
    obj.javaClass.declaredMethods.forEach {
        println("${it.name}")
    }

}

fun getType(obj: Type) {
    println(obj.typeName)
}


fun main() {

    getType(Transaction::class.java)

    introspectInstance(Transaction(1, 200.0, "Simple Transaction"))
}