package com.example.android.ui.main.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Film(
    val id: Int,
    val title: String,
    val episodeId: Int,
    val openingCrawl: String,
    val director: String,
    val producer: String,
) : Parcelable
