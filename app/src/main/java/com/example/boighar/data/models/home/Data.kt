package com.example.boighar.data.remote.home

data class Data(
    val catcode: String,
    val catname: String,
    val catname_bn: String,
    val contents: List<Content>,
    val contenttype: String,
    val contentviewtype: String,
    val execution_time: String,
    val itemtype: String
)