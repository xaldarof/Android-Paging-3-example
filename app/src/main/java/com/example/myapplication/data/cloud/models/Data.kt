package com.example.myapplication.data.cloud.models

import com.example.myapplication.data.cache.models.DataModelDb

data class Data(
    val __v: Int,
    val _id: String,
    val airline: List<Airline>?,
    val name: String? =null,
    val trips: Int){

    fun mapToDbModel(): DataModelDb {
        return DataModelDb(__v, _id, "", trips)
    }
}
