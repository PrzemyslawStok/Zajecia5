package com.com.zajecia5

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [imageDao::class, imageDao1::class], version = 1)
abstract class ImagesDatabase : RoomDatabase() {
    abstract fun imagesDao(): imageDao
    abstract fun imagesDatabaseInterface(): imageDao1
}