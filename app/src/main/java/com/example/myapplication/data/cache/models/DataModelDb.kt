package com.example.myapplication.data.cache.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myapplication.core.DataModel
import com.example.myapplication.data.core.models.Airline
import com.example.myapplication.data.core.models.Data
import java.io.Serializable

@Entity(tableName = "cache")
data class DataModelDb(

    val __v: Int,

    @PrimaryKey
    val _id: String,
    val name: String,
    val trips: Int
) {

    fun mapToData(): Data {
        return Data(__v, _id, name = "", airline = null, trips = trips)
    }
}