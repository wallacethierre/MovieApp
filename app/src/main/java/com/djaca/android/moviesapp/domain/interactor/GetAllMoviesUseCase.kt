package com.djaca.android.moviesapp.domain.interactor

import androidx.lifecycle.LiveData
import com.djaca.android.moviesapp.domain.entity.MoviesDomain
import com.djaca.android.moviesapp.domain.repository.MoviesRepositoryContract
import javax.inject.Inject

class GetAllMoviesUseCase @Inject constructor(private val moviesRepository: MoviesRepositoryContract) {
    suspend fun getAllMovies(): LiveData<List<MoviesDomain>> {
        return moviesRepository.getAllMovies()
    }
}