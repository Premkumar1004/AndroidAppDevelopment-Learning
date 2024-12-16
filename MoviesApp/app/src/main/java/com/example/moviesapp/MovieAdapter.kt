package com.example.moviesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.PointerIconCompat.load
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import javax.microedition.khronos.opengles.GL

class MovieAdapter(val context:MainActivity,val names: List<String>,val images: List<Int>):RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var image: ImageView = itemView.findViewById(R.id.image)
        var name:TextView = itemView.findViewById(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Glide.with(context).load(images[position]).into(holder.image)

        holder.name.text = names[position]
    }

    override fun getItemCount(): Int {
        return names.size
    }
}