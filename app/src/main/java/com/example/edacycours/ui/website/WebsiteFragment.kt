package com.example.edacycours.ui.website

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.edacycours.R

class WebsiteFragment : Fragment() {

    companion object {
        fun newInstance() = WebsiteFragment()
    }

    private lateinit var viewModel: WebsiteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.website_fragment, container, false)
    }

}
