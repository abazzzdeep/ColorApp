package com.example.colorapp

import kotlinx.coroutines.flow.Flow

class ColorRepository(private val colorDao: ColorDao) {
    fun getAllColors(): Flow<List<CustomColor>> = colorDao.getAllColors()

    suspend fun insertColor(color: CustomColor) = colorDao.insertColor(color)
}