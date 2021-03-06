package com.example.android.network.starships

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StarShipApiModel(
    val url: String,
    val name: String,
    val model: String,
    val manufacturer: String,
    @SerialName("cost_in_credits") val coastInCredits: String,
    val length: String,
    @SerialName("max_atmosphering_speed") val maxAtmospheringSpeed: String,
    val crew: String,
    val passengers: String,
    @SerialName("cargo_capacity") val cargoCapacity: String,
    val consumables: String,
    @SerialName("hyperdrive_rating") val hyperdriveRating: String,
    val MGLT: String,
    @SerialName("starship_class") val starshipClass: String,
)