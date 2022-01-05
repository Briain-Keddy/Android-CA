package com.example.ca_1

import com.example.ca_1.WEB_SERVICE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object RetrofitInstance {

    private val retrofit by lazy {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)
        Retrofit.Builder()
            .baseUrl(WEB_SERVICE_URL)
            .addCoverterFactory(MoshiConverterFactory.create())
            .clint(httpClient.build())
            .build()
    }

    val api: TvShowApi by lazy {
        retrofit.create(TvShowApi::class.java)
    }
}