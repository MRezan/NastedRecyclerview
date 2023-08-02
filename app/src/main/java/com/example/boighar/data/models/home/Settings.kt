package com.example.boighar.data.remote.home

data class Settings(
    val currentversion: String,
    val enforce: String,
    val enforcetext: String,
    val is_subscribed: Int,
    val login_email: String,
    val login_facebook: String,
    val login_google: String,
    val message_forceupdate: String,
    val message_update: String,
    val pay_bkash: String,
    val pay_bkash_sub: String,
    val pay_city: String,
    val pay_city_sub: String,
    val pay_gpay: String,
    val pay_nagad: String,
    val pay_portwallet: String,
    val pay_portwallet_sub: String,
    val pay_stripe: String,
    val show_cart: String,
    val show_sub: String,
    val show_usd: String
)