package com.srhan.domain.usecase

import com.srhan.domain.repo.MealsRepo

class GetMealsUseCase(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}