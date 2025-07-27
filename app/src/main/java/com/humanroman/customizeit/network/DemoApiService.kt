package com.humanroman.customizeit.network

import com.humanroman.customizeit.network.model.TestDto
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://humanroman.com/backends/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

object DemoApi {
    val retrofitService: DemoApiService by lazy {
        retrofit.create(DemoApiService::class.java)
    }
}

interface DemoApiService {

    @GET("customizeit/")
    suspend fun getTestData() : TestDto

}

