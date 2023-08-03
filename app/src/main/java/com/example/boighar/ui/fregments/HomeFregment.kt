package com.example.boighar.ui.fregments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.boighar.data.remote.home.HomeResponse
import com.example.boighar.data.repository.HomeRepository
import com.example.boighar.data.services.HomeServices
import com.example.boighar.data.services.RetrofitHelper
import com.example.boighar.databinding.FragmentHomeFregmentBinding
import com.example.boighar.ui.adapters.ChildItemAdapter
import com.example.boighar.ui.adapters.ListAdapter
import com.example.boighar.ui.viewmodels.HomeViewModel
import com.example.boighar.ui.viewmodels.factory.HomeViewModelFactory


class HomeFregment : Fragment() {

    private lateinit var binding: FragmentHomeFregmentBinding
    private lateinit var homeViewModel: HomeViewModel
    private lateinit var listAdapter: ListAdapter
    private lateinit var childListAdapter: ChildItemAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeFregmentBinding.inflate(inflater, container, false)
        val view = binding.root



        val recyclerView: RecyclerView = binding.parentRecyclerview


        val homeServices = RetrofitHelper.getInstense().create(HomeServices::class.java)
        val repository = HomeRepository(homeServices)
        val viewModelFactory = HomeViewModelFactory(repository)
        homeViewModel = ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)



        listAdapter = ListAdapter(emptyList())
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = listAdapter



        homeViewModel.home_data.observe(viewLifecycleOwner, Observer { homeData ->
            homeData?.let {
                Log.e("xxxxxxxxxxx",homeData.data.toString())
                listAdapter.homeData = homeData.data
                binding.progressBar.visibility = View.GONE
                binding.parentRecyclerview.visibility = View.VISIBLE
                listAdapter.notifyDataSetChanged()
            }
        })

        homeViewModel.getHomeData()

        return view
    }
}
