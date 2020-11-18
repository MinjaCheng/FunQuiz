package com.example.funquiz

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuestionDao {

    @Query("SELECT * FROM quiz")
    fun getAllLiveData(): LiveData<List<Question>>

    @Query("SELECT * FROM quiz")
    fun getAll(): List<Question>

    @Insert
    fun insert(question: Question)

    @Delete
    fun delete(question: Question)




}