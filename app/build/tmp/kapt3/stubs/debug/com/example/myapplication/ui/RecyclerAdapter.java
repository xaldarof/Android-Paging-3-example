package com.example.myapplication.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/myapplication/ui/RecyclerAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/example/myapplication/data/core/models/Data;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffUtilCallBack", "VH", "app_debug"})
public final class RecyclerAdapter extends androidx.paging.PagingDataAdapter<com.example.myapplication.data.core.models.Data, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    
    public RecyclerAdapter() {
        super(null, null, null);
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/myapplication/ui/RecyclerAdapter$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemBinding", "Lcom/example/myapplication/databinding/ItemBinding;", "(Lcom/example/myapplication/ui/RecyclerAdapter;Lcom/example/myapplication/databinding/ItemBinding;)V", "onBind", "", "data", "Lcom/example/myapplication/data/core/models/Data;", "app_debug"})
    final class VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.myapplication.databinding.ItemBinding itemBinding = null;
        
        public VH(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.databinding.ItemBinding itemBinding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.data.core.models.Data data) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/myapplication/ui/RecyclerAdapter$DiffUtilCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/myapplication/data/core/models/Data;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffUtilCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.myapplication.data.core.models.Data> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.myapplication.ui.RecyclerAdapter.DiffUtilCallBack INSTANCE = null;
        
        private DiffUtilCallBack() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.data.core.models.Data oldItem, @org.jetbrains.annotations.NotNull()
        com.example.myapplication.data.core.models.Data newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.data.core.models.Data oldItem, @org.jetbrains.annotations.NotNull()
        com.example.myapplication.data.core.models.Data newItem) {
            return false;
        }
    }
}