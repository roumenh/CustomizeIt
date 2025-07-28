package com.humanroman.customizeit.data.model

import com.humanroman.customizeit.network.model.AllProductsResponseDto

data class Product(
    val name: String,
)

fun AllProductsResponseDto.asListOfProducts() : List<Product>{
    return this.products.map { it ->
        Product(it.name)
    }
}