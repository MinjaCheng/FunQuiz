package com.example.funquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pressPlayButton = findViewById<Button>(R.id.button)

        pressPlayButton.setOnClickListener{
            val intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
        }
    }
}