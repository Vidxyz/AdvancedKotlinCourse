package com.vid.kotlincourse.functions

class Request(val method: String, val query: String, val contentType: String)

class Response(var contents: String, var status: Status) {

    fun status(status: Status.() -> Unit) {

    }

}

class Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false;
    fun next() {
        executeNext = true
    }

}


fun response(response: Response.() -> Unit) {}

fun status(status: Status.() -> Unit) {}


// Pay attention to this convention, and how it is being handled for this use case
// Useful for structuring code more logically
fun routeHandler(path: String,  f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f


fun main() {


    routeHandler("/index.html") {
        if(request.query != "" ) {
            // process
        }
//        response.status.code = 404
//        response.contents = "Not found"
        response {
            status  {
                code = 404
                description = "Not found"
            }
        }
    }

}