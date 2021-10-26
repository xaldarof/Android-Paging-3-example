package com.example.myapplication.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.WaitingItemBinding

class PassengersLoaderAdapter(private val retry:()->Unit): LoadStateAdapter<PassengersLoaderAdapter.LoadStateViewHolder>() {

   inner class LoadStateViewHolder(private val waitingItemBinding: WaitingItemBinding) :
        RecyclerView.ViewHolder(waitingItemBinding.root) {

        init {
            waitingItemBinding.retryBtn.setOnClickListener {
                retry.invoke()
            }
        }

        fun onBind(loadState: LoadState) {
            waitingItemBinding.progressView.isVisible = loadState is LoadState.Loading
            waitingItemBinding.retryBtn.isVisible = loadState !is LoadState.Loading
            waitingItemBinding.errorTv.isVisible = loadState !is LoadState.Loading

        }
    }

    override fun onBindViewHolder(holder: LoadStateViewHolder, loadState: LoadState) {
        holder.onBind(loadState)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoadStateViewHolder {
        return LoadStateViewHolder(
            WaitingItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false)
        )

    }
}