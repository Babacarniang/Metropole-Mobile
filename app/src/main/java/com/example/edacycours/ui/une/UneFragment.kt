package com.example.edacycours.ui.une

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.edacycours.R

class UneFragment : Fragment() {

    companion object {
        fun newInstance() = UneFragment()
    }

    private lateinit var viewModel: UneViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.une_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(UneViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
