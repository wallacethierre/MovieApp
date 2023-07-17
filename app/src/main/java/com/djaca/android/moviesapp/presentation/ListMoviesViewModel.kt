package com.djaca.android.moviesapp.presentation

import android.util.Log
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.djaca.android.moviesapp.domain.interactor.GetAllMoviesUseCase
import com.djaca.android.moviesapp.presentation.mapper.toListMoviesView
import com.djaca.android.moviesapp.ui.model.MovieView
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListMoviesViewModel @Inject constructor(private val getAllMoviesUseCase: GetAllMoviesUseCase) :
    ViewModel() {


}