package com.example.funquiz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    @SuppressLint("StringFormatMatches")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val correctAnswer = intent.getIntExtra(CORRECT_ANSWERS, 0)
        val totalQuestions = intent.getIntExtra(TOTAL_QUESTIONS, 0)

        scoreTextView.text = getString(R.string.score_tv, correctAnswer, totalQuestions)

        val scorePercent = ((correctAnswer.toFloat() / totalQuestions.toFloat()) * 100).toInt()

        scorePercentTextView.text = getString(R.string.score_percent_tv, scorePercent)

        when {
            scorePercent < 25 -> {
                credTextView.text = getString(R.string.cred_tv_ok)
            }
            scorePercent < 50 -> {
                credTextView.text = getString(R.string.cred_tv_good)
            }
            scorePercent < 75 -> {
                credTextView.text = getString(R.string.cred_tv_very_good)
            }
            else -> {
                credTextView.text = getString(R.string.cred_tv_excellent)
            }
        }
    }

    fun playAgainButton(view: View) {
        val intent = Intent(this, QuestionActivity::class.java)
        startActivity(intent)
        finish()
    }
}