package com.srhan.domain.repo

import com.srhan.domain.models.CategoryResponse

interface MealsRepo {
    suspend fun getMealsFromRemote(): CategoryResponse
}