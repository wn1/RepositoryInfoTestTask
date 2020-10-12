package com.example.repositoryinfotesttask.mvvm.repository

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.repositoryinfotesttask.R

class RepListFragment : Fragment() {

    companion object {
        fun newInstance() =
            RepListFragment()
    }

    private lateinit var viewModel: RepListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.rep_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RepListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}