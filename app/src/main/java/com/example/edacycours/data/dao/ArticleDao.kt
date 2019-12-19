package com.example.edacycours.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.edacycours.data.model.Article

@Dao
interface ArticleDao : BaseDao<Article> {

    @Query("SELECT * FROM articles")
    fun getAll(): List<Article>
}