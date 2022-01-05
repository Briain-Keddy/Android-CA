package com.example.ca_1

import com.example.ca_1.TvShowEntity
import retrofit2.Response
import retrofit2.http.GET

interface TvShowApi {
    @GET("tvShow.json")
    suspend fun getTvShow() : List<TvShowEntity>
}