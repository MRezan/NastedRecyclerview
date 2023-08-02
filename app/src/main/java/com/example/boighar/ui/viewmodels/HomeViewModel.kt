package com.example.boighar.ui.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.boighar.data.remote.home.HomeResponse
import com.example.boighar.data.repository.HomeRepository
import kotlinx.coroutines.launch

class HomeViewModel(private val homeRepository: HomeRepository) : ViewModel() {
    private val _homeData = MutableLiveData<HomeResponse>()
    val home_data: LiveData<HomeResponse> = _homeData


    fun getHomeData() {
        viewModelScope.launch {
            Log.e("eee","viewmodel")
            try {
                val home_data = homeRepository.getHomeData()
                _homeData.value = home_data!!
            } catch (e: Exception) {
                Log.e("eee",e.message.toString())

            }
        }
    }



}