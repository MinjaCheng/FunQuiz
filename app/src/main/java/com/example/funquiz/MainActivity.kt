package com.example.funquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.room.Room
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

class MainActivity : AppCompatActivity() {

    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppDatabase.getInstance(this)
    }

    fun pressPlayButton(view: View) {

        val intent = Intent(this, QuestionActivity::class.java)
        startActivity(intent)
        finish()
    }
}