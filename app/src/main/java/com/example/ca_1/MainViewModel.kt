package com.example.ca_1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ca_1.data.TvShowEntity
import com.example.ca_1.dataaccess.RetrofitInstance
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _tvShowList:  MutableLiveData<List<TvShowEntity>>() = MutableLiveData()

    val tvShows: LiveData<List<TvShowEntity>>
    get() = _tvShowList

    private val _isLoading = MutavlesLiveData(false)
    val isLoading: LiveData<Boolean>
    get() = _isLoading

    init {
        getTvShow()
    }
    private fun getTvShow(){
        viewModelScope.launch{
            _isLoading.value = true
            val fetchedTvShow = RetrofitInstance.api.getTvShow()
            Log.i(TAG, "List of TV Shows : $fetchedTvShow")
            _tvShows.value = fetchedTvShow
            _isLoading.value = false
        }
    }
}