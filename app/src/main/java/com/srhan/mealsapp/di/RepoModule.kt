package com.srhan.mealsapp.di

import com.srhan.data.remote.ApiService
import com.srhan.data.repo.MealsRepoImpl
import com.srhan.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    @Singleton
    fun provideRepo(apiService: ApiService): MealsRepo {
        return MealsRepoImpl(apiService)
    }

}