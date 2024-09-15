package com.example.myapplication79

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlbumAdapter(private val listItems: List<Album>) : RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userIdTextView: TextView = itemView.findViewById(R.id.userIdTextView)
        val idTextView: TextView = itemView.findViewById(R.id.idTextView)
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.album_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val album = listItems[position]
        holder.userIdTextView.text = album.userId.toString()
        holder.idTextView.text = album.id.toString()
        holder.titleTextView.text = album.title

    }

    override fun getItemCount(): Int {
        return listItems.size
    }
}