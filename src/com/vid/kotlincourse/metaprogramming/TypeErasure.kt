package com.vid.kotlincourse.metaprogramming


fun <T> printlist(list: List<T>) {
    // This is all we can do
    if (list is List<*>) {
        println("This is a list of something")
    }

    // This cannot be done, problem
    /*
    when(list) {
        is List<String> -> println("This is a list of string")
        is List<Int> -> println("This is a list of int")
    }

     */
}


fun <T> printList(obj: T) {
    when(obj) {
        is Int -> println("This is an int")
        is String -> println("This is a string")
    }
}


inline fun <reified T> erased(input: List<Any>) {
    if (input is T) {
        ///
    }
}

// ONLY FOR INLINE FUNCTIONS, get info of type at runtime
inline fun <reified T> typeInfo() {
    println(T::class)
}

fun main() {


    val listStrings = listOf("One", "Two", "Three")
    val listOfNumbers = listOf(1,2,3)


}