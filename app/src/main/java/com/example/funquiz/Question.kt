package com.example.funquiz

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "quiz")
class Question (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "question") var question: String,
    @ColumnInfo(name = "image") var image: Int?,
    @ColumnInfo(name = "optionOne") var optionOne: String,
    @ColumnInfo(name = "optionTwo") var optionTwo: String,
    @ColumnInfo(name = "optionThree") var optionThree: String,
    @ColumnInfo(name = "correctOption") var correctOption: String,
    @ColumnInfo(name = "fact") var fact: String
)