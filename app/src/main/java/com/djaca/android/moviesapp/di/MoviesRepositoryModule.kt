package com.djaca.android.moviesapp.di

import com.djaca.android.moviesapp.data.repository.MoviesRepository
import com.djaca.android.moviesapp.data.source.MoviesRemoteDataSourceImpl
import com.djaca.android.moviesapp.domain.repository.MoviesRemoteDataSource
import com.djaca.android.moviesapp.domain.repository.MoviesRepositoryContract
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MoviesRepositoryModule {

    @Binds
    @Singleton
    abstract fun provideMoviesRemoteSource(impl: MoviesRemoteDataSourceImpl): MoviesRemoteDataSource

    @Binds
    @Singleton
    abstract fun provideMoviesRepository(impl: MoviesRepository): MoviesRepositoryContract
}