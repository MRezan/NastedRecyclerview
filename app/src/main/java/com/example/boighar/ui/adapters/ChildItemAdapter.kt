package com.example.boighar.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.boighar.R
import com.example.boighar.data.remote.home.Content

class ChildItemAdapter(private var contentData: List<Content>) : RecyclerView.Adapter<ChildItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_child, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = contentData[position]
        holder.textView.text = currentItem.title

        //holder.imageView.setImageURI(currentItem.image)


        Glide.with(holder.imageView.context)
            .load(currentItem.bookcover)
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imageView)

    }

    override fun getItemCount(): Int {
        return contentData.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.title_textView)
        val imageView : ImageView = itemView.findViewById(R.id.image_view_id)

    }
}
