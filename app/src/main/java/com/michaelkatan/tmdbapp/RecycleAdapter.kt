package com.michaelkatan.tmdbapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.michaelkatan.tmdbapp.R.id.result_movie_name
import com.michaelkatan.tmdbapp.R.id.result_poster
import com.michaelkatan.tmdbapp.models.Result


class RecycleAdapter(val items: Array<Result>) : RecyclerView.Adapter<RecycleAdapter.ResultViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder
    {
        return LayoutInflater.from(parent.context).inflate(R.layout.result_item,parent,false) as ResultViewHolder
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int)
    {
        holder.movieTitle.text = items[position].title
        val imagePrefix = "https://image.tmdb.org/t/p/w500/"
        
    }


    override fun getItemCount(): Int
    {
        return items.size
    }


    class ResultViewHolder(val view: View) : RecyclerView.ViewHolder(view)
    {
        val moviePosterImage = result_poster as ImageView
        val movieTitle = result_movie_name as TextView
    }
}
