package com.djaca.android.moviesapp.domain.mapper

import com.djaca.android.moviesapp.data.api.dto.MovieResponse
import com.djaca.android.moviesapp.domain.entity.MoviesDomain

fun List<MovieResponse>.toMoviesDomain(): List<MoviesDomain> {
    return map {MoviesDomain(it.id, it.title, it.description, it.imageURL, it.category)}
}