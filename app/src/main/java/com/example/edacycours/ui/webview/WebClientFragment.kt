package com.example.edacycours.ui.webview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.edacycours.R
import com.example.edacycours.data.model.Article
import kotlinx.android.synthetic.main.fragment_web_client.*

class WebClientFragment : Fragment() {

    private lateinit var article: Article
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web_client, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val args = WebClientFragmentArgs.fromBundle(it)
            article = args.article
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()
    }

    fun initUi() {
        webview.loadUrl(article.url)
    }
}
