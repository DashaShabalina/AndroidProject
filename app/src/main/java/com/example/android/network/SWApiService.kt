package com.example.android.network

import com.example.android.network.starships.StarShipApiModel
import com.example.android.network.films.FilmApiModel
import retrofit2.http.GET
import retrofit2.http.Query

interface SWApiService {

    @GET("starships")
    suspend fun getStarShips(@Query("page") page: Int): Model<StarShipApiModel>

    @GET("films")
    suspend fun getFilms(@Query("page") page: Int): Model<FilmApiModel>
}