package com.vid.kotlincourse.coroutines

import java.util.concurrent.CompletableFuture


private fun startLongAsyncOperation(v: Int) =
        CompletableFuture.supplyAsync {
            Thread.sleep(1000)
            "Result: $v"
        }

fun main() {

    // async await keywords not found...
    // Need kotlinx dependency via gradle
    // yield allows us to suspend execution at some point and return to main "thread
    // asyncRx also not found  here, need additionnal dependency
    // `
}