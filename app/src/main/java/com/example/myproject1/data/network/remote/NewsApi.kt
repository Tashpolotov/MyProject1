package com.example.myproject1.data.network.remote


import com.example.myproject1.model.News
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("everything")
    suspend fun getNews(
        @Query("apiKey") apiKey: String = "de666f89a73d4aa790a692d007bcaa1a",
        @Query("q") search: String,
        @Query("pageSize") pageSize: Int = 10,
        @Query("page") page: Int = 1,
    ): Response<News>
}