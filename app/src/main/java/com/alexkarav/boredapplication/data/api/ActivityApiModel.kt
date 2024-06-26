package com.alexkarav.boredapplication.data.api


import com.google.gson.annotations.SerializedName
/*
* Модель с данными, которую мы получаем с API
*/
data class ActivityApiModel(
    @SerializedName("accessibility")
    val accessibility: Double,
    @SerializedName("activity")
    val activity: String,
    @SerializedName("key")
    val key: String,
    @SerializedName("link")
    val link: String,
    @SerializedName("participants")
    val participants: Int,
    @SerializedName("price")
    val price: Double,
    @SerializedName("type")
    val type: String
)