package com.michaelkatan.tmdbapp.interfaces

import com.michaelkatan.tmdbapp.models.Request
import retrofit2.http.GET
import retrofit2.http.Query

interface DataRequest
{


    @GET ("search/movie")
    fun getMovies(@Query("api_key") apiKey: String, @Query("query") query : String,
                  @Query("region")region: String = "", @Query("year") year: Int = 0): retrofit2.Call<Request>

    

}