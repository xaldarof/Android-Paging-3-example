package com.example.myapplication.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.core.models.Data
import com.example.myapplication.databinding.ItemBinding

class RecyclerAdapter : PagingDataAdapter<Data, RecyclerView.ViewHolder>(DiffUtilCallBack) {

    private inner class VH(private val itemBinding: ItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun onBind(data: Data) {
            itemBinding.idTv.text = data._id
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        getItem(position)?.let { (holder as VH).onBind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return VH(ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }


    object DiffUtilCallBack : DiffUtil.ItemCallback<Data>() {

        override fun areItemsTheSame(oldItem: Data, newItem: Data): Boolean {
            return oldItem._id == newItem._id
        }

        override fun areContentsTheSame(oldItem: Data, newItem: Data): Boolean {
            return oldItem == newItem
        }
    }
}