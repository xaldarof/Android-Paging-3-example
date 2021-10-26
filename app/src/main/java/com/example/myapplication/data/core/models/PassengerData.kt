package com.example.myapplication.data.core.models

import com.example.myapplication.core.DataModel


data class PassengerData(
    val `data`: List<Data>,
    val totalPages: Int,
    val totalPassengers: Int){

    fun mapToData():DataModel {
        return DataModel(data)
    }
}