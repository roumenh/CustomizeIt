package com.humanroman.customizeit.data.repository

import com.humanroman.customizeit.data.model.Product
import com.humanroman.customizeit.network.DemoApi

interface ProductsRepository {

    val allProducts : List<Product>

}

class ProductsRepositoryImpl: ProductsRepository {

    override val allProducts: List<Product> = DemoApi.retrofitService.getTestData()

}
