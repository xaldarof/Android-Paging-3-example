package com.example.myapplication.data.cache

import com.example.myapplication.data.cache.dao.CoreDao
import com.example.myapplication.data.cache.models.DataModelDb

interface CacheRepository {

    suspend fun fetchCacheData() : List<DataModelDb>
    suspend fun insertCacheData(list: List<DataModelDb>)
    suspend fun clearCache()

    class Base(private val dao: CoreDao) : CacheRepository {

        override suspend fun fetchCacheData(): List<DataModelDb> {
            return dao.fetchAllTypes()
        }

        override suspend fun insertCacheData(list: List<DataModelDb>) {
            dao.insertAll(list)
        }

        override suspend fun clearCache() {
            dao.clearCache()
        }
    }
}