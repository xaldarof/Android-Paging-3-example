package com.example.myapplication.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u00a8\u0006\n"}, d2 = {"cacheModule", "Lorg/koin/core/module/Module;", "getCacheModule", "()Lorg/koin/core/module/Module;", "cloudModule", "getCloudModule", "provideApiService", "Lcom/example/myapplication/data/cloud/CloudService;", "retrofit", "Lretrofit2/Retrofit;", "app_debug"})
public final class CoreModuleKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module cacheModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module cloudModule = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myapplication.data.cloud.CloudService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getCacheModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getCloudModule() {
        return null;
    }
}