package com.example.ca_1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val tvShowList = MutableLiveData<List<TvShowEntity>>()

    init {
        tvShowList.value = SampleDataProvider.getTvShow()
    }
}