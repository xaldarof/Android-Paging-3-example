package com.example.myapplication.ui;

import java.lang.System;

@org.koin.core.component.KoinApiExtension()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myapplication/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "()V", "adapter", "Lcom/example/myapplication/ui/RecyclerAdapter;", "binding", "Lcom/example/myapplication/databinding/ActivityMainBinding;", "viewModel", "Lcom/example/myapplication/data/vm/MainViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements org.koin.core.component.KoinComponent {
    private com.example.myapplication.databinding.ActivityMainBinding binding;
    private com.example.myapplication.ui.RecyclerAdapter adapter;
    private final com.example.myapplication.data.vm.MainViewModel viewModel = null;
    
    public MainActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}