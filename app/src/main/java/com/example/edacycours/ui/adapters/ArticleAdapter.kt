package com.example.edacycours.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.edacycours.R
import com.example.edacycours.data.model.Article
import kotlinx.android.synthetic.main.article_item.view.*

class ArticleAdapter(
    private val articles: List<Article>,
    private val itemClick: (Article) -> Unit
) : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {

    private var context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.article_item, parent, false)
        context = parent.context
        return ArticleViewHolder(view, itemClick)
    }

    override fun getItemCount() = articles.size

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.bindArticle(getItem(position))
    }

    private fun getItem(position: Int): Article {
        return articles[position]
    }

    class ArticleViewHolder(
        var view: View,
        private val itemClick: (Article) -> Unit,
        var item: Article? = null
    ) : RecyclerView.ViewHolder(view) {

        fun bindArticle(article: Article) {
            with(article) {
                itemView.article_title.text = title
                itemView.article_description.text = description
                itemView.setOnClickListener { itemClick(this) }
                Glide.with(view).load(image).into(itemView.article_image)
                Glide.with(view).load(websiteUrl).into(itemView.article_website)
            }
        }
    }
}