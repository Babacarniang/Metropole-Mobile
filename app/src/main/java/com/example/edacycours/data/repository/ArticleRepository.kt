package com.example.edacycours.data.repository

import androidx.lifecycle.LiveData
import com.example.edacycours.data.dao.ArticleDao
import com.example.edacycours.data.model.Article
import com.example.edacycours.database
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

object ArticleRepository : BaseRepository<ArticleDao> {

    var job: CompletableJob? = null

    override fun dao(): ArticleDao {
        return database.articleDao()
    }

    fun getArticles(): LiveData<List<Article>> {
        job = Job()
        return object : LiveData<List<Article>>() {
            override fun onActive() {
                super.onActive()
                job?.let { theJob ->
                    CoroutineScope(IO + theJob).launch {
                        val articles = dao().getAll()
                        withContext(Main) {
                            value = articles
                            theJob.complete()
                        }
                    }
                }
            }
        }
    }

    fun cancelJobs() {
        job?.cancel()
    }
}