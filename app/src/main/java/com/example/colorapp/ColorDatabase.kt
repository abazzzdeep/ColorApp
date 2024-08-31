package com.example.colorapp

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [CustomColor::class], version = 1)
abstract class ColorDatabase : RoomDatabase() {
    abstract fun colorDao(): ColorDao
}
