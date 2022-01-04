package com.example.ca_1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ca_1.data
import com.example.ca_1
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val tvShowList = MutableLiveData<List<TvShowEntity>>()

    init {
        tvShowList.value = SampleDataProvider.getTvShow()
    }
}