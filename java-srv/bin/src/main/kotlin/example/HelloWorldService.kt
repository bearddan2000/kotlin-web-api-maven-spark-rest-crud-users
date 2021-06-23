package example;

import spark.kotlin.*;
import com.google.gson.Gson;

fun main(args: Array<String>) {
    val http: Http = ignite()

    http.get("/v") {
        "Hello World"
    }

    http.get("/w") {
        "Hello World"
    }

    http.put("/x") {
        "Hello World"
    }

    http.delete("/y") {
        "Hello World"
    }

    http.options("/z") {
        "Hello World"
    }
}
