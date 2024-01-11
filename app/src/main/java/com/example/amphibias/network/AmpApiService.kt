package com.example.amphibias.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.GET

const val BASE_URL="https://android-kotlin-fun-mars-server.appspot.com/"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()
interface AmpApiService{
    @GET("amphibians")
    suspend fun getAmpihibias():String
}

object AmpApi{
    val retrofitServive: AmpApiService by lazy {
        retrofit.create(AmpApiService::class.java)
    }
}