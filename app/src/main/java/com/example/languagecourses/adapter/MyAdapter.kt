package com.example.languagecourses.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.languagecourses.DataClass.Cprogramming
import com.example.languagecourses.databinding.ListItemBinding

class MyAdapter(private val itemlist:ArrayList<Cprogramming>): RecyclerView.Adapter<MyAdapter.customadpter>() {
    class customadpter (val binding: ListItemBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): customadpter {
        return  customadpter(ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    override fun onBindViewHolder(holder: customadpter, position: Int) {
        val image=itemlist[position].titleImage
        holder.binding.titleImage.setImageResource(image)
        holder.binding.tvTitle.text=itemlist[position].heading


    }
}


