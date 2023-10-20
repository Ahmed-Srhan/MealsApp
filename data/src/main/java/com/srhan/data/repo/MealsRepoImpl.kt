package com.srhan.data.repo

import com.srhan.data.remote.ApiService
import com.srhan.domain.models.CategoryResponse
import com.srhan.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}