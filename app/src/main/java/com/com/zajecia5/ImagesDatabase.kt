package com.com.zajecia5

import androidx.room.Database

@Database(entities = [imageDao::class], version = 1)
abstract class ImagesDatabase {
    abstract fun imagesDao(): imageDao
}