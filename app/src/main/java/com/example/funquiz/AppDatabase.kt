package com.example.funquiz

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Question::class), version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract val questionDao: QuestionDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {             // som kan returnera AppDatabase, men man ska bara kunna gör det en gång och inte skapa flera instanser

            synchronized(this) {                                  // kör ett tråd i taget
                var instance = INSTANCE

                if (instance == null) {                                    // om det finns ett object skapa objectet, om det finns object så kommer inte det skapas
                    instance = Room.databaseBuilder(
                        context.applicationContext,                       // context för hela appen
                        AppDatabase::class.java,
                        "questions_database"
                    )
                        .fallbackToDestructiveMigration()                  // det är ok att föregående data försvinner om vi går upp en version
                        .build()
                }
                return instance
            }
        }
    }

}