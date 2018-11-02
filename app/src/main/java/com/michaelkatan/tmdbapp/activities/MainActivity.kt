package com.michaelkatan.tmdbapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.michaelkatan.tmdbapp.R
import com.michaelkatan.tmdbapp.fragments.MainSearchScreen

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null)
        {
            supportFragmentManager.beginTransaction().add(R.id.mainFragmentPlace, MainSearchScreen())
                .commit()
        }

    }
}
