package com.example.plugins

import com.example.product.service.ProductService
import io.ktor.server.application.*
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin

fun Application.configureKoin(){
    install(Koin){
        modules(appModule)
    }
}

val appModule = module {
    singleOf(::ProductService)
}
