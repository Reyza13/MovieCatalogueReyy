package com.reyy.moviecataloguereyy

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/top_rated?api_key=f456ef59e2fd866a30fd9c380c5da6c8")
    fun getMovieList(): Call<MovieResponse>
}