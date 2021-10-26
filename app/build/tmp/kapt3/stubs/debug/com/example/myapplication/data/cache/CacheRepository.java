package com.example.myapplication.data.cache;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/myapplication/data/cache/CacheRepository;", "", "clearCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCacheData", "", "Lcom/example/myapplication/data/cache/DataModelDb;", "insertCacheData", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Base", "app_debug"})
public abstract interface CacheRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchCacheData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.myapplication.data.cache.DataModelDb>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertCacheData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.data.cache.DataModelDb> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearCache(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myapplication/data/cache/CacheRepository$Base;", "Lcom/example/myapplication/data/cache/CacheRepository;", "dao", "Lcom/example/myapplication/data/cache/dao/CoreDao;", "(Lcom/example/myapplication/data/cache/dao/CoreDao;)V", "clearCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCacheData", "", "Lcom/example/myapplication/data/cache/DataModelDb;", "insertCacheData", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static final class Base implements com.example.myapplication.data.cache.CacheRepository {
        private final com.example.myapplication.data.cache.dao.CoreDao dao = null;
        
        public Base(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.data.cache.dao.CoreDao dao) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object fetchCacheData(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<com.example.myapplication.data.cache.DataModelDb>> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object insertCacheData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.myapplication.data.cache.DataModelDb> list, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object clearCache(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
    }
}