package com.vid.kotlincourse.delegation

import kotlin.reflect.KProperty

class Service {

    var someProperty: String by ExternalFunctionality()

}


class ExternalFunctionality {

    var backingField = "Default"

    operator fun getValue(service: Service, property: KProperty<*>): String {
        println("getValue called with paramts: \n" +
                "service: $service\n" +
                "propery: ${property.name}")
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, s: String) {
        backingField = s
    }

}


fun main() {

    val service = Service()

    println(service.someProperty)
    service.someProperty = "POTATO"
    println(service.someProperty)

}