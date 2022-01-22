package com.example.android.di

import com.example.android.network.SWApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiServiceModule {

    @OptIn(ExperimentalSerializationApi::class)
    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://swapi.dev/api/")
            .addConverterFactory(Json {
                ignoreUnknownKeys = true
            }.asConverterFactory(MediaType.get("application/json")))
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): SWApiService {
        return retrofit.create()
    }
}