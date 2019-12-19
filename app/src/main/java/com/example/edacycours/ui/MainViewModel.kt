package com.example.edacycours.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.edacycours.data.model.Article
import com.example.edacycours.data.repository.ArticleRepository

class MainViewModel : ViewModel() {

    var articles: LiveData<List<Article>>? = null
        private set
        get() {
            return ArticleRepository.getArticles()
        }

}
