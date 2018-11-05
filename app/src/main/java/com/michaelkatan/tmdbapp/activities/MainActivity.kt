package com.michaelkatan.tmdbapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.michaelkatan.tmdbapp.R
import com.michaelkatan.tmdbapp.fragments.MainSearchScreen
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        setSupportActionBar(Maintoolbar)
        val actionBar = supportActionBar

        if(actionBar != null)
        {
            actionBar.setDisplayShowHomeEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black)
        }


        if(savedInstanceState == null)
        {
            supportFragmentManager.beginTransaction().add(R.id.mainFragmentPlace, MainSearchScreen())
                .commitNow()
        }


    }
}
