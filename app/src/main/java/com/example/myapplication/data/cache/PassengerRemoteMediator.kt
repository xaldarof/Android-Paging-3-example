package com.example.myapplication.data.cache

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.example.myapplication.data.cache.dao.CoreDao
import com.example.myapplication.data.cloud.CloudService

@ExperimentalPagingApi
class PassengerRemoteMediator(
    private val coreDao: CoreDao,
    private val cloudService: CloudService
) : RemoteMediator<Int, DataModelDb>() {


    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, DataModelDb>
    ): MediatorResult {
        return try {
            val data = cloudService.fetchPassengers(10, 10)
            val endReached = data.data.isEmpty()

            MediatorResult.Success(endReached)

        } catch (e: Exception) {
            MediatorResult.Error(e)
        }
    }
}