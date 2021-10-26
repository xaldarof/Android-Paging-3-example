package com.example.myapplication.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myapplication/core/CloudResult;", "", "()V", "Fail", "Success", "Lcom/example/myapplication/core/CloudResult$Success;", "Lcom/example/myapplication/core/CloudResult$Fail;", "app_debug"})
public abstract class CloudResult {
    
    private CloudResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myapplication/core/CloudResult$Success;", "Lcom/example/myapplication/core/CloudResult;", "data", "Lcom/example/myapplication/data/core/models/PassengerData;", "(Lcom/example/myapplication/data/core/models/PassengerData;)V", "getData", "()Lcom/example/myapplication/data/core/models/PassengerData;", "app_debug"})
    public static final class Success extends com.example.myapplication.core.CloudResult {
        @org.jetbrains.annotations.NotNull()
        private final com.example.myapplication.data.core.models.PassengerData data = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.data.core.models.PassengerData data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.myapplication.data.core.models.PassengerData getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myapplication/core/CloudResult$Fail;", "Lcom/example/myapplication/core/CloudResult;", "e", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Fail extends com.example.myapplication.core.CloudResult {
        
        public Fail(@org.jetbrains.annotations.NotNull()
        java.lang.String e) {
            super();
        }
    }
}