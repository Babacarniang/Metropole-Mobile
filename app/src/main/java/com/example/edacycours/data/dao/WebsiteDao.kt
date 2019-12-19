package com.example.edacycours.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.edacycours.data.model.Website

@Dao
interface WebsiteDao : BaseDao<Website> {

    @Query("SELECT * FROM websites")
    fun getAll(): List<Website>
}