package com.djaca.android.moviesapp.di

import com.djaca.android.moviesapp.data.api.MoviesAPIContract
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.math.log

private const val URL_BASE = "https://movies-mock-server.vercel.app"

@Module
@InstallIn(SingletonComponent::class)
object MoviesNetworkModule {

    fun provideMoviesAPI(): MoviesAPIContract {
        val logger = HttpLoggingInterceptor()
        logger.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient.Builder().addInterceptor(logger).build()

        return Retrofit.Builder()
            .baseUrl(URL_BASE)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MoviesAPIContract::class.java)
    }

}