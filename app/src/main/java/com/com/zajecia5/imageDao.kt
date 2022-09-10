package com.com.zajecia5

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

@Dao
interface imageDao {
    //@Query("SELECT * FROM ")
    @Insert
    fun addImage(image: ImageData)

    @Delete
    fun deleteImage(image: ImageData)
}