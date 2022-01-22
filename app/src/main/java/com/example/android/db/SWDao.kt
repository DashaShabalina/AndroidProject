package com.example.android.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android.db.model.FilmDbModel
import com.example.android.db.model.StarShipDbModel

@Dao
interface SWDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllFilms(items: List<FilmDbModel>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllShips(items: List<StarShipDbModel>)

    @Query("SELECT * FROM films")
    suspend fun getAllFilms(): List<FilmDbModel>

    @Query("SELECT * FROM starships")
    suspend fun getAllShips(): List<StarShipDbModel>

    @Query("DELETE FROM films")
    suspend fun removeAllFilms()

    @Query("DELETE FROM starships")
    suspend fun removeAllShips()
}