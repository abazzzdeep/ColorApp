package com.example.colorapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class ColorViewModel(private val repository: ColorRepository) : ViewModel() {
    val allColors: StateFlow<List<CustomColor>> = repository.getAllColors()
        .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    fun insertColor(color: CustomColor) = viewModelScope.launch {
        repository.insertColor(color)
    }
}