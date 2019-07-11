package com.vid.kotlincourse.classes

import sun.jvm.hotspot.debugger.Page


// Sealed means only classes within it can inherit from teh result
// Within it + within the same file
sealed class PageResult() {
}

class Success(val content: String): PageResult()
class Error(val code: Int, val message: String): PageResult()
class MediumSuccess(): PageResult()


fun getURLPage(url: String): PageResult {
    val wasValidCall = false

    if (wasValidCall) {
        return Success("Content")
    } else {
        return Error(404, "Not Found")
    }

}

fun main() {
    val pageResult = getURLPage("/")
    when (pageResult) {
        is Success -> println(pageResult.content)
        is Error -> println(pageResult.message)
    }
}