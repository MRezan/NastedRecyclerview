package com.example.boighar.data.remote.home

data class HomeResponse(
    val `data`: List<Data>,
    val execution_time: String,
    val settings: Settings,
    val status: Status
)