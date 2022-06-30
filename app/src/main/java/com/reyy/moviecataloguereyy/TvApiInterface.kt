package com.reyy.moviecataloguereyy

import retrofit2.Call
import retrofit2.http.GET

interface TvApiInterface {

    @GET("/3/tv/top_rated?api_key=f456ef59e2fd866a30fd9c380c5da6c8")
    fun getTvList(): Call<TvResponse>
}