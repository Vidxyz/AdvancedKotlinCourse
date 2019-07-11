package com.vid.kotlincourse.classes

import kotlin.properties.Delegates

class Customer() {

    private var myCustomField = 10

    var lastPurchasedAmount: Double = 0.0
        get() = field
        set(value) {
            if(value > 100) {
                field = value
            }
        }

}



class Veto {
    var value: String by Delegates.vetoable("String") {prop, old, new -> new.startsWith("S")}

}


fun main() {
    val customer = Customer()

    println(customer.lastPurchasedAmount)
    customer.lastPurchasedAmount = 200.0
    println(customer.lastPurchasedAmount)
    customer.lastPurchasedAmount = 50.0
    println(customer.lastPurchasedAmount)



    val veto = Veto()
    println(veto.value)
    // No change beacause vetoable property not satisfied
    veto.value = "London"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)


}