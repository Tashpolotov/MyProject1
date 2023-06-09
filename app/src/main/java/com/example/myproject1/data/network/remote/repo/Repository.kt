package com.example.myproject1.data.network.remote.repo

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.myproject1.data.network.remote.NewsApi
import com.example.myproject1.model.ErrorResponse
import com.example.myproject1.model.News
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers

class Repository(private val newsApi: NewsApi) {

    fun getNews(search: String): LiveData<News> = liveData(Dispatchers.IO) {
        /*emit(Resource.loading())*/
        val result = newsApi.getNews(search = search)
        if (result.isSuccessful) {
            /*emit(Resource.success(result.body()))*/
            result.body()?.let { emit(it) }

        } else {
            val jObjError = result.errorBody()?.string()
            val gson = Gson()
            val data = gson.fromJson(jObjError, ErrorResponse::class.java)
            /*emit(Resource.error(data.error?.message.toString()))*/
        }
    }
}

