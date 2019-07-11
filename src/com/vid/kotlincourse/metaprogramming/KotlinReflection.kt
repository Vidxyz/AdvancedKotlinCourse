package com.vid.kotlincourse.metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

// Kotlin reflection needs the right gradle dependency



fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main() {

    val classInfo = Transaction::class

    // View the output to understand
    classInfo.memberProperties.forEach {
        println("Property ${it.name} of type ${it.returnType}")
    }

    classInfo.constructors.forEach {
        println("Constructor - ${it.name} - ${it.parameters}")
    }
    println('\n')
    getKotlinType(Transaction::class)


    val constructor = ::Transaction
    println(constructor)

    val transaction = constructor.call(1, 2000.0, "Some description")
    println(transaction.description)

    val transaction2 = constructor.callBy(mapOf(constructor.parameters[0] to 1,
        constructor.parameters[1] to 2000.0))

    println(transaction2)


    // Can also reference param by name, not just by index number
    val idParam = constructor.parameters.first() {it.name == "id"}
    val amountParam = constructor.parameters.first() {it.name == "amount"}

    val transaction3 = constructor.callBy(mapOf(idParam to 1,
        amountParam to 2000.0))

    println(transaction3)

    // Accessing the member function
    val validateFun = Transaction::validate


    // This can be useful for retrieving info at runtime
    val trans = Transaction(1, 20.0, "New Value")
    val nameProperty = Transaction::class.memberProperties.find { it.name == "description" }

    println(nameProperty?.get(trans))

}