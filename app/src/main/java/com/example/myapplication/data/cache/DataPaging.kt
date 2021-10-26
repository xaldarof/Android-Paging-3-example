package com.example.myapplication.data.cache

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.myapplication.data.cloud.CloudConstants
import com.example.myapplication.data.cloud.CloudService
import com.example.myapplication.data.cloud.models.Data
import java.lang.Exception

class DataPaging(private val cloudService: CloudService,private val cacheRepository: CacheRepository) : PagingSource<Int, Data>() {

    override fun getRefreshKey(state: PagingState<Int, Data>): Int? {
        return state.anchorPosition?.let {
            val anchorPos = state.closestPageToPosition(it)
            anchorPos?.prevKey?.plus(1) ?: anchorPos?.nextKey?.minus(1)
        }
    }

    private var isCacheCleared = false

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Data> {
        return try {
            val currentLoadingPageKey = params.key ?: 1
            val pageDataSize = CloudConstants.PAGE_SIZE
            val response = cloudService.fetchPassengers(currentLoadingPageKey, pageDataSize)
            val data = response.data

            val prevKey = if (currentLoadingPageKey == 1) null else currentLoadingPageKey - 1

            if (!isCacheCleared) {
                cacheRepository.clearCache()
                isCacheCleared = true
            }

            cacheRepository.insertCacheData(data.map { it.mapToDbModel() })
            LoadResult.Page(data = data, prevKey = prevKey, nextKey = currentLoadingPageKey.plus(1))

        }
        catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}