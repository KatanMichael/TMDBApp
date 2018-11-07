package com.michaelkatan.tmdbapp.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.michaelkatan.tmdbapp.R
import com.michaelkatan.tmdbapp.adapters.RecycleAdapter
import com.michaelkatan.tmdbapp.models.Result
import kotlinx.android.synthetic.main.serach_result_fragment.*


class showResultsFragment: Fragment()
{

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.serach_result_fragment, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        val bundle = arguments
        val data = bundle?.getSerializable("data") as Array<Result>
        val recycleAdapter = RecycleAdapter(data)

        search_result_recycleView.adapter = recycleAdapter
        search_result_recycleView.layoutManager = LinearLayoutManager(context)

    }

}
