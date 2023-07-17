package com.djaca.android.moviesapp.domain.repository

import androidx.lifecycle.LiveData
import com.djaca.android.moviesapp.data.api.dto.MovieResponse
import com.djaca.android.moviesapp.domain.entity.MoviesDomain

interface MoviesRepositoryContract {
    suspend fun getAllMovies(): LiveData<List<MoviesDomain>>
}

interface MoviesRemoteDataSource {
    suspend fun getAllMovies(): LiveData<List<MovieResponse>>
}