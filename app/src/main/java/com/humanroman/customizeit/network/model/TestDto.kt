package com.humanroman.customizeit.network.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TestDto(
    val name: String,
    val location: String,
    val business: String,
)
