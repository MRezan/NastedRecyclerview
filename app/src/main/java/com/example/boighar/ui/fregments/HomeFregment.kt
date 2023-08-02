package com.example.boighar.ui.fregments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.boighar.R
import com.example.boighar.data.remote.home.HomeResponse
import com.example.boighar.data.repository.HomeRepository
import com.example.boighar.data.services.HomeServices
import com.example.boighar.data.services.RetrofitHelper
import com.example.boighar.databinding.FragmentHomeFregmentBinding
import com.example.boighar.ui.viewmodels.HomeViewModel
import com.example.boighar.ui.viewmodels.factory.HomeViewModelFactory


class HomeFregment : Fragment() {

    private lateinit var binding: FragmentHomeFregmentBinding
    val movieList = mutableListOf<HomeResponse>()
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeFregmentBinding.inflate(layoutInflater)
        val view = binding.root



        val homeServices = RetrofitHelper.getInstense().create(HomeServices::class.java)
        val repository = HomeRepository(homeServices)
        val viewModelFactory = HomeViewModelFactory(repository)
        homeViewModel = ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)



        // Observe the home LiveData
        homeViewModel.home_data.observe(viewLifecycleOwner, Observer { data ->
            // Handle the movie data here
            Log.e("rrr", data.toString())

        })

        homeViewModel.getHomeData()











        return view
    }


}