package com.example.myweatherapiroom.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.myweatherapiroom.data.entity.Weather

@Dao
interface WeatherDao {
    @Query("SELECT * FROM weather")
    fun getAll(): List<Weather>

    @Query("SELECT * FROM weather WHERE uid IN (:weatherIds)")
    fun loadAllByIds(weatherIds: IntArray): List<Weather>

    @Insert
    fun insertAll(vararg weather: Weather)

    @Delete
    fun delete(weather: Weather)

    @Query("SELECT * FROM weather WHERE uid = :uid")
    fun get(uid: Int): Weather

    @Update
    fun update(weather: Weather)
}