package com.srhan.data.remote

import com.srhan.domain.models.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getMeals(): CategoryResponse
}