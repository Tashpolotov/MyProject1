package com.example.myproject1.fragments.adapter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.switchMap
import com.example.myproject1.base.BaseViewModel
import com.example.myproject1.data.network.remote.repo.Repository


class NewsViewModel(private val repository: Repository) : BaseViewModel() {

    private val service = MutableLiveData<String>()

    val serviceNews = service.switchMap { search ->
        repository.getNews(search)
    }

    fun getNews(search: String) {
        service.value = search
    }
}