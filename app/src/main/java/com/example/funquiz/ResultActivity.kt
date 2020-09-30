package com.example.funquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.scoreTextView
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val correctAnswer = intent.getIntExtra(ListOfQuestions.CORRECT_ANSWERS,0)
        val totalQuestions = intent.getIntExtra(ListOfQuestions.TOTAL_QUESTIONS,0)


        scoreTextView.text = "$correctAnswer / $totalQuestions"

        val scorePercent: Int = ((correctAnswer.toFloat()/totalQuestions.toFloat())*100).toInt()

        scorePercentTextView.text = "Du fick $scorePercent % rätt."

        if (scorePercent < 25){
            credTextView.text = "Ok!"
        }
        else if (scorePercent < 50){
            credTextView.text = "Bra!"
        }
        else if (scorePercent < 75){
            credTextView.text = "Jättebra!"
        } else {
           credTextView.text = "Utmärkt!"
        }


    }

    fun playAgainButton (view: View) {
        val intent = Intent(this, QuestionActivity::class.java)
        startActivity(intent)
        finish()
    }
}