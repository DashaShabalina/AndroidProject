package com.example.android.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.android.db.model.FilmDbModel
import com.example.android.db.model.StarShipDbModel

@Database(entities = [FilmDbModel::class, StarShipDbModel::class], version = 2)
abstract class SwDatabase : RoomDatabase() {

    abstract fun dao(): SWDao

    companion object{
        fun getInstance(context: Context):  SwDatabase{
            return Room.databaseBuilder(context, SwDatabase::class.java, "appdatabase")
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}