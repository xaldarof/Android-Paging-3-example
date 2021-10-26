package com.example.myapplication.data.vm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/myapplication/data/vm/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "cloudService", "Lcom/example/myapplication/data/cloud/CloudService;", "cacheRepository", "Lcom/example/myapplication/data/cache/CacheRepository;", "(Lcom/example/myapplication/data/cloud/CloudService;Lcom/example/myapplication/data/cache/CacheRepository;)V", "passengerData", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/myapplication/data/core/models/Data;", "getPassengerData", "()Lkotlinx/coroutines/flow/Flow;", "fetchCacheData", "", "Lcom/example/myapplication/data/cache/DataModelDb;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.myapplication.data.cloud.CloudService cloudService = null;
    private final com.example.myapplication.data.cache.CacheRepository cacheRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.myapplication.data.core.models.Data>> passengerData = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.data.cloud.CloudService cloudService, @org.jetbrains.annotations.NotNull()
    com.example.myapplication.data.cache.CacheRepository cacheRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.myapplication.data.core.models.Data>> getPassengerData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchCacheData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.myapplication.data.cache.DataModelDb>> continuation) {
        return null;
    }
}