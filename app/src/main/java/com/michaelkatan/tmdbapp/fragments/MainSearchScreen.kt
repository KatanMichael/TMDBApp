package com.michaelkatan.tmdbapp.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.michaelkatan.tmdbapp.R
import com.michaelkatan.tmdbapp.controllers.RetroController
import com.michaelkatan.tmdbapp.interfaces.RequestListener
import com.michaelkatan.tmdbapp.models.Result
import kotlinx.android.synthetic.main.main_search_fragment.*
import kotlinx.coroutines.*

class MainSearchScreen : Fragment()
{
    val controller =  RetroController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        main_search_btn.setOnClickListener()
        {
            val searchText = main_search_et.text.toString()
            controller.getMovies(searchText, object : RequestListener
            {
                override fun onComplete(results: Array<Result>)
                {
                    val bundle = Bundle()
                    bundle.putSerializable("data",results)
                    val resultFrag = showResultsFragment()
                    resultFrag.arguments = bundle

                    val manager = activity?.supportFragmentManager

                    if(manager != null)
                    {
                        Log.d("Main","manager not null")
                        manager.beginTransaction().replace(R.id.mainFragmentPlace, resultFrag)
                            .addToBackStack(null).commit()
                        Log.d("Main","after commit")

                    }
                }

                override fun onError(message: String)
                {
                    Log.d("Main, onError",message)
                    Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
                }

            })
        }


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.main_search_fragment,container,false)

        return view
    }

    suspend fun changeTv()
    {
        runBlocking {
            launch (Dispatchers.Main){

            }
        }

    }

}