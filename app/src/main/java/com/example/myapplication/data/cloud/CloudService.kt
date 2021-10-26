package com.example.myapplication.data.cloud

import com.example.myapplication.data.core.models.PassengerData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface CloudService {

    @GET("passenger")
    suspend fun fetchPassengers(
        @Query("page") page: Int,
        @Query("size") size :Int):PassengerData
}