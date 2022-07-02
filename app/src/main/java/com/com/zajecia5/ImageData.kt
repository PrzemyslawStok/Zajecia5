package com.com.zajecia5

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ImageData(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "image_name") val imageName: String?,
    @ColumnInfo(name = "image_size") val imageSize: Int?
)