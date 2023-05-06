package com.example.myproject1.model

import com.example.myproject1.model.Article

data class News(
    var articles: List<Article?>? = null,
    var status: String? = null, // ok
    var totalResults: Int? = null // 13885
)