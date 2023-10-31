package com.example.myweatherapiroom.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Weather(
    @PrimaryKey(autoGenerate = true) var uid: Int? = null,
    @ColumnInfo(name = "city_name") var cityName: String?,
    @ColumnInfo(name = "temperature") var temp: String?,
    @ColumnInfo(name = "windy_speed") var windySpeed: String?,
    @ColumnInfo(name = "pressure") var pressure: String?,
    @ColumnInfo(name = "humidity") var humidity: String?,
    @ColumnInfo(name = "time") var time: String?
)