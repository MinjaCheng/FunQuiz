package com.example.funquiz

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item (
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "question") val question: String?,
    @ColumnInfo(name = "image") val image: Int,
    @ColumnInfo(name = "optionOne") val optionOne: String?,
    @ColumnInfo(name = "optionTwo") val optionTwo: String?,
    @ColumnInfo(name = "optionThree") val optionThree: String?,
    @ColumnInfo(name = "correctOption") val correctOption: String?,
    @ColumnInfo(name = "fact") val fact: String?
)


