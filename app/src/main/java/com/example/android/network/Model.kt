package com.example.android.network

import kotlinx.serialization.Serializable

@Serializable
data class Model<T>(
        val count: Int,
        val next: String?,
        val previous: String?,
        val results: List<T>,
)
