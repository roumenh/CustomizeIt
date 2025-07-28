package com.humanroman.customizeit.data.model

data class ProductProperty(
    val name: String,
    val description: String?,
    val imageUrl: String?,
    val type: PropertyType,
)

enum class PropertyType{
    CHECKBOX,
    RADIO,
    FREETEXT
    // SLIDER, ..
}