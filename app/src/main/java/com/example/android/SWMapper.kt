package com.example.android

import com.example.android.db.model.FilmDbModel
import com.example.android.db.model.StarShipDbModel
import com.example.android.network.films.FilmApiModel
import com.example.android.network.starships.StarShipApiModel
import com.example.android.ui.main.models.Film
import com.example.android.ui.main.models.Starship

object SWMapper {

    fun filmApiToDbModel(apiModel: FilmApiModel) = FilmDbModel(
        id = apiModel.url.split("/").last { it.isNotEmpty() }.toInt(),
        title = apiModel.title,
        episodeId = apiModel.episodeId,
        openingCrawl = apiModel.openingCrawl,
        director = apiModel.director,
        producer = apiModel.producer,
    )

    fun shipToDbModel(apiModel: StarShipApiModel) = StarShipDbModel(
        id = apiModel.url.split("/").last { it.isNotEmpty() }.toInt(),
        name = apiModel.name,
        model = apiModel.model,
        starshipClass = apiModel.starshipClass,
        manufacturer = apiModel.manufacturer,
        costInCredits = apiModel.coastInCredits,
        length = apiModel.coastInCredits,
        crew = apiModel.crew,
        passengers = apiModel.passengers,
        maxAtmospheringSpeed = apiModel.maxAtmospheringSpeed,
        hyperdriveRating = apiModel.hyperdriveRating,
        MGLT = apiModel.MGLT,
        cargoCapacity = apiModel.cargoCapacity,
        consumables = apiModel.consumables,
    )

    fun filmToUiModel(dbEntity: FilmDbModel) = Film(
        id = dbEntity.id,
        title = dbEntity.title,
        episodeId = dbEntity.episodeId,
        openingCrawl = dbEntity.openingCrawl,
        director = dbEntity.director,
        producer = dbEntity.producer,
    )

    fun shipToUiModel(dbEntity: StarShipDbModel) = Starship(
        id = dbEntity.id,
        name = dbEntity.name,
        model = dbEntity.model,
        starshipClass = dbEntity.starshipClass,
        manufacturer = dbEntity.manufacturer,
        costInCredits = dbEntity.costInCredits,
        length = dbEntity.length,
        crew = dbEntity.crew,
        passengers = dbEntity.passengers,
        maxAtmospheringSpeed = dbEntity.maxAtmospheringSpeed,
        hyperdriveRating = dbEntity.hyperdriveRating,
        MGLT = dbEntity.MGLT,
        cargoCapacity = dbEntity.cargoCapacity,
        consumables = dbEntity.consumables,
    )
}