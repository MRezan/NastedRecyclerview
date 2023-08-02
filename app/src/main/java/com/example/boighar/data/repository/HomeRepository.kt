package com.example.boighar.data.repository

import com.example.boighar.data.remote.home.HomeResponse
import com.example.boighar.data.services.HomeServices

class HomeRepository(private val homeServices: HomeServices) {
    suspend fun getHomeData(): HomeResponse? {
        val response = homeServices.getHomeData()
        if (response.isSuccessful) {
            return response.body()
        }
        return null
    }
}