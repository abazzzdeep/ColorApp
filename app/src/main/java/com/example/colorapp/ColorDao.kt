package com.example.colorapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ColorDao {
    @Query("SELECT * FROM color_table")
    fun getAllColors(): Flow<List<CustomColor>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertColor(color: CustomColor): List<Long>
}
