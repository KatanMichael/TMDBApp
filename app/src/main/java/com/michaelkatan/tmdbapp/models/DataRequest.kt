package com.michaelkatan.tmdbapp.models

data class Request(val page: Int,val total_results: Int
                       ,val total_pages: Int, val results: Array<Result>)
{


}