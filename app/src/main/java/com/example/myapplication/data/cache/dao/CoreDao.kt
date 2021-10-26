package com.example.myapplication.data.cache.dao

import androidx.room.*
import com.example.myapplication.data.cache.DataModelDb

@Dao
interface CoreDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(list: List<DataModelDb>)

    @Query("SELECT * FROM cache")
    suspend fun fetchAllTypes(): List<DataModelDb>


    @Query("DELETE FROM cache")
    fun clearCache()
}