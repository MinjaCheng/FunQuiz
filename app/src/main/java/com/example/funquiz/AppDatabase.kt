package com.example.funquiz

import androidx.room.RoomDatabase

abstract class AppDatabase: RoomDatabase() {
    abstract fun itemDao(): ItemDao
}