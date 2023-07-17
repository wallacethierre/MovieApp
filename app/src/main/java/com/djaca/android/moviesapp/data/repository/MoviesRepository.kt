package com.djaca.android.moviesapp.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.djaca.android.moviesapp.domain.entity.MoviesDomain
import com.djaca.android.moviesapp.domain.mapper.toMoviesDomain
import com.djaca.android.moviesapp.domain.repository.MoviesRemoteDataSource
import com.djaca.android.moviesapp.domain.repository.MoviesRepositoryContract
import javax.inject.Inject

class MoviesRepository @Inject constructor(
    private val moviesRemoteDataSource: MoviesRemoteDataSource
) : MoviesRepositoryContract {
    override suspend fun getAllMovies(): LiveData<List<MoviesDomain>> = Transformations.map(
        moviesRemoteDataSource.getAllMovies()
    ) {
       it.toMoviesDomain()
    }

}