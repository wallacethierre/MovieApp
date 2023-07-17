package com.djaca.android.moviesapp.data.api

import com.djaca.android.moviesapp.data.api.dto.MovieResponse
import retrofit2.http.GET

interface MoviesAPIContract {
    @GET("/movies")
    suspend fun getAllMovies(): List<MovieResponse>
}