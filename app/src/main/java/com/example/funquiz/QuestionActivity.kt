package com.example.funquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        
        val question = findViewById<TextView>(R.id.questionTextView)

        question.text = getString(R.string.questionOne)

        val guessButton1 = findViewById<Button>(R.id.guessButton1)

        guessButton1.text = "25 000 kr"

        val guessButton2 = findViewById<Button>(R.id.guessButton2)

        guessButton2.text = "97 000 kr"

        val guessButton3 = findViewById<Button>(R.id.guessButton3)

        guessButton3.text = "400 000 kr"
    }
}