package com.example.boighar.data.services

import com.example.boighar.data.remote.home.HomeResponse
import retrofit2.Response
import retrofit2.http.GET

interface HomeServices {
    @GET("$BASE_URL/$API_URL/$HOME")
    suspend fun getHomeData(): Response<HomeResponse>
}