package com.example.edacycours.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.edacycours.data.dao.ArticleDao
import com.example.edacycours.data.dao.WebsiteDao
import com.example.edacycours.data.model.Article
import com.example.edacycours.data.model.Website


@Database(entities = [Website::class, Article::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun websiteDao(): WebsiteDao
    abstract fun articleDao(): ArticleDao
}