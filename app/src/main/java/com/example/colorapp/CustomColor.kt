package com.example.colorapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "color_table")
data class CustomColor(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val color: String,
    val time: Long
)
