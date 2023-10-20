package com.srhan.mealsapp.di

import com.srhan.domain.repo.MealsRepo
import com.srhan.domain.usecase.GetMealsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Singleton
    @Provides
    fun provideMealsUseCase(mealsRepo: MealsRepo): GetMealsUseCase {
        return GetMealsUseCase(mealsRepo)

    }
}