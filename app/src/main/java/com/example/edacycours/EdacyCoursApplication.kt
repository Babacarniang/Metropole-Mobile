package com.example.edacycours

import android.app.Application
import androidx.room.Room
import com.example.edacycours.data.AppDatabase

val database: AppDatabase by lazy {
    EdacyCoursApplication.database
}

class EdacyCoursApplication : Application() {

    companion object {
        lateinit var instance: EdacyCoursApplication
            private set

        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        initilization()
    }

    private fun initilization() {
        configDatabase()
    }

    private fun configDatabase() {
        database = Room
            .databaseBuilder(applicationContext, AppDatabase::class.java, "sentame-db")
            .fallbackToDestructiveMigration()
            .build()
    }


}