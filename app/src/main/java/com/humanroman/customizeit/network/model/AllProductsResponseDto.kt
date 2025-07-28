package com.humanroman.customizeit.network.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AllProductsResponseDto(
    val products: List<ProductDto>
)


@JsonClass(generateAdapter = true)
data class ProductDto(
    val name: String,
)