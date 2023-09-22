package com.example.product

import com.example.product.service.ProductService
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject


fun Routing.product() {

    val service by inject<ProductService>()
    get("/product") {
        call.respond(
            service.list()
        )
    }
}
