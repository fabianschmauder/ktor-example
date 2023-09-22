package com.example.plugins

import com.example.product.product
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        product()
    }
}
