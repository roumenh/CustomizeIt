package com.humanroman.customizeit.data.model

import com.humanroman.customizeit.network.model.AllProductsResponseDto

data class Product(
    val name: String,
    val imageUrl: String?,
    val description: String?,
    val basePrice: Double,
)

fun AllProductsResponseDto.asListOfProducts() : List<Product>{
    return this.products.map { it ->
        Product(
            it.name,
            imageUrl = null,
            description = null,
            basePrice = 0.0, //TODO remove mock data
        )
    }
}