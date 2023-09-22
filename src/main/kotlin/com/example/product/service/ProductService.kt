package com.example.product.service

import com.example.product.dto.Product

class ProductService {

    private val products = listOf(
        Product("Nice Product"),
        Product("Nice Product2")
    )

    fun list() = products
}
