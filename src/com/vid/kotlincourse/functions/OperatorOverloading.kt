package com.vid.kotlincourse.functions

import java.lang.StringBuilder

data class Time(val hours: Int, val mins: Int) {

    operator fun plus(time: Time): Time {
        val m = this.mins + time.mins
        val hoursInMins = m / 60
        val rem = m  % 60
        val hours = this.hours + time.hours + hoursInMins
        return Time(hours, rem)
    }

}

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach { this.append(it) }
}

fun main() {
    val newTime = Time(10,40) + Time(3, 22)
    println(newTime)

    val sb = StringBuilder()

    for (str in sb) {
        str + "Value"
    }

    println(sb)

}