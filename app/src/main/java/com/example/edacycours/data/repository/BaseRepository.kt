package com.example.edacycours.data.repository

interface BaseRepository<Dao> {
    fun dao(): Dao
}