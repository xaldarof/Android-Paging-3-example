package com.example.myapplication.di

import com.example.myapplication.data.cache.dao.CoreDao
import com.example.myapplication.data.cloud.CloudConstants
import com.example.myapplication.data.cloud.CloudService
import com.example.myapplication.data.vm.MainViewModel
import com.example.myapplication.data.cache.AppDatabase
import com.example.myapplication.data.cache.CacheRepository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.converter.gson.GsonConverterFactory


fun provideApiService(retrofit: retrofit2.Retrofit): CloudService =
    retrofit.create(CloudService::class.java)

val cacheModule = module {
    factory<CoreDao> { AppDatabase.getInstance(androidContext()).coreDaoProvider() }
    factory<CloudService> { provideApiService(get()) }
    factory<CacheRepository> { CacheRepository.Base(get()) }
    factory<MainViewModel> { MainViewModel(get(), get()) }
}

val cloudModule = module {
    single {
        retrofit2.Retrofit.Builder()
            .baseUrl(CloudConstants.URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}