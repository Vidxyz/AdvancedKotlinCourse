package com.vid.kotlincourse.classes



class Log private constructor(val filename: String) {

    // Each class can only have ONE companion object
    // Use annotation to make it callable via JAVA
    companion object Factory {
        @JvmStatic fun createFileLog(filename: String): Log = Log(filename)
    }

}

fun main() {

    val log = Log.createFileLog("filename.txt")

    // This is not doable if we add keywords private constructor
//    val log2 = Log()

}