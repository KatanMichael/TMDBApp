package com.michaelkatan.tmdbapp.interfaces

import com.michaelkatan.tmdbapp.models.Result


interface RequestListener
{
    fun onComplete(results : Array<Result>)

    fun onError(message : String)
}