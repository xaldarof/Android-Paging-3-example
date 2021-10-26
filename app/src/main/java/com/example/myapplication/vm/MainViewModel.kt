package com.example.myapplication.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.myapplication.data.cache.CacheRepository
import com.example.myapplication.data.cache.DataPaging
import com.example.myapplication.data.cloud.CloudConstants
import com.example.myapplication.data.cloud.CloudService

class MainViewModel(
    private val cloudService: CloudService,
    private val cacheRepository: CacheRepository) : ViewModel() {

    val passengerData = Pager(PagingConfig(CloudConstants.PAGE_SIZE)) {
        DataPaging(cloudService, cacheRepository)
    }.flow
        .cachedIn(viewModelScope)


    suspend fun fetchCacheData() = cacheRepository.fetchCacheData()


}