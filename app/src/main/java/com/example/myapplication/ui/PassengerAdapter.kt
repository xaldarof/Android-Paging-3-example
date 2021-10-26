package com.example.myapplication.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.cloud.models.Data
import com.example.myapplication.databinding.ItemBinding

class PassengerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val oldList = ArrayList<Data>()

    fun update(newList: List<Data>){
        oldList.clear()
        oldList.addAll(newList)
        notifyDataSetChanged()
    }

    inner class VH(private val itemBinding: ItemBinding):RecyclerView.ViewHolder(itemBinding.root){

        fun onBind(data: Data){
            itemBinding.idTv.text = data._id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return VH(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as VH).onBind(oldList[position])
    }

    override fun getItemCount(): Int = oldList.size


}