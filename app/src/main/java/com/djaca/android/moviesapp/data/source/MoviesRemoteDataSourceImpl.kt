package com.djaca.android.moviesapp.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.djaca.android.moviesapp.data.api.MoviesAPIContract
import com.djaca.android.moviesapp.data.api.dto.MovieResponse
import com.djaca.android.moviesapp.domain.repository.MoviesRemoteDataSource
import javax.inject.Inject

class MoviesRemoteDataSourceImpl @Inject constructor(private val networkSource: MoviesAPIContract): MoviesRemoteDataSource {
    private val liveDataMoviesList =  MutableLiveData<List<MovieResponse>>()
    override suspend fun getAllMovies(): LiveData<List<MovieResponse>> {
        liveDataMoviesList.value = networkSource.getAllMovies()
        return liveDataMoviesList
    }
}