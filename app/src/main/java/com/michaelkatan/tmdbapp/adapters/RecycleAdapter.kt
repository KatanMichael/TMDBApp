package com.michaelkatan.tmdbapp.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.michaelkatan.tmdbapp.models.Result

import com.michaelkatan.tmdbapp.R


class RecycleAdapter(val items: Array<Result>,val context: Context) : RecyclerView.Adapter<RecycleAdapter.ResultViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.result_item, parent, false)

        return ResultViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int)
    {
        holder.movieTitle.text = items[position].title
        val imagePrefix = "https://image.tmdb.org/t/p/w500/"
        val urlString = (imagePrefix+items.get(position).poster_path)

        Log.wtf("urlChack", urlString)

        Glide.with(context)
            .load(urlString)
            .into(holder.moviePosterImage)

    }


    override fun getItemCount(): Int
    {
        return items.size
    }


    class ResultViewHolder(val view: View) : RecyclerView.ViewHolder(view)
    {
        val moviePosterImage : ImageView = view.findViewById(R.id.result_poster)
        val movieTitle: TextView = view.findViewById(R.id.result_movie_name)
    }
}
