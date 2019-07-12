package com.vid.kotlincourse.coroutines

import java.util.concurrent.CompletableFuture


private fun startLongAsyncOperation(v: Int) =
        CompletableFuture.supplyAsync {
            Thread.sleep(1000)
            "Result: $v"
        }

fun main() {

    // async await keywords not found...


}