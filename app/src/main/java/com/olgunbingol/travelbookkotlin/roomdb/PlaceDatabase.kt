package com.olgunbingol.travelbookkotlin.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.olgunbingol.travelbookkotlin.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao

}