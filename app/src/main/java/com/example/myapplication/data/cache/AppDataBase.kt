package com.example.myapplication.data.cache

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.data.cache.dao.CoreDao

@Database(entities = [DataModelDb::class], version = 2, exportSchema = false)

abstract class AppDatabase : RoomDatabase() {

    abstract fun coreDaoProvider(): CoreDao

    companion object {
        private const val DATABASE_NAME = "DATABASE"

        fun getInstance(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}