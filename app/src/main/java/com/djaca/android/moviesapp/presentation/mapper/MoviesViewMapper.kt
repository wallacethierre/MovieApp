package com.djaca.android.moviesapp.presentation.mapper

import com.djaca.android.moviesapp.domain.entity.MoviesDomain
import com.djaca.android.moviesapp.ui.model.MovieView

fun List<MoviesDomain>.toListMoviesView(): List<MovieView> {
    return map {
        MovieView(it.id, it.title, it.description, it.imageURL, it.category)
    }
}