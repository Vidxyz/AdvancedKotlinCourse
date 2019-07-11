package com.vid.kotlincourse.delegation

fun localDelegatedProperties() {

    val lazy by lazy { initLate() }

}

fun initLate(): String {
    return "String"
}