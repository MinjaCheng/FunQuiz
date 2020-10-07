package com.example.funquiz

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    lateinit var questionsList: ArrayList<Question>
    private var currentPosition: Int = 1
    private var correctAnswers: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        questionsList = ListOfQuestions.getQuestions()

        setQuestion()

    }

    private fun setQuestion() {

        val question = questionsList[currentPosition - 1]

        textViewProgress.text =
            "$currentPosition / ${questionsList!!.size}" // ***** fråga hur jag flyttar upp den till the bar

        questionTextView.text = question.question
        imageView.setImageResource(question.image)
        optionButtonOne.text = question.optionOne
        optionButtonTwo.text = question.optionTwo
        optionButtonThree.text = question.optionThree

        if (currentPosition < questionsList!!.size) {
            nextQueButton.text = "Nästa"
        } else {
            nextQueButton.text = "Klar"
        }

    }


    fun pressedButton(view: View) {

        val question = questionsList[currentPosition - 1]

        when (view.id) {
            R.id.optionButtonOne -> {
                selectedOption(question.optionOne)
            }
            R.id.optionButtonTwo -> {
                selectedOption(question.optionTwo)
            }
            R.id.optionButtonThree -> {
                selectedOption(question.optionThree)
            }
        }
        toggleButton(true)
        currentPosition++
    }

    private fun selectedOption(selectedOption: String) {

        val question = questionsList[currentPosition - 1]

        if (question.correctOption == selectedOption) {

            correctAnswerTextView.text = "Rätt!"
            correctAnswerTextView.setTextColor(Color.parseColor("#00BB00"))
            correctAnswers++

        } else {
            correctAnswerTextView.text = "$selectedOption är fel!"
            correctAnswerTextView.setTextColor(Color.parseColor("#BB0000"))
        }
        factTextView.text = "Svaret är: ${question.correctOption}\n\n${question.fact}"
    }

    fun nextQuestionButton(view: View) {

        if (currentPosition <= questionsList!!.size) {

            toggleButton(false)

            setQuestion()

        } else {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(ListOfQuestions.CORRECT_ANSWERS, correctAnswers)
            intent.putExtra(ListOfQuestions.TOTAL_QUESTIONS, questionsList!!.size)
            startActivity(intent)
        }
    }

    private fun toggleButton(toggle: Boolean){
        if (toggle){
            factCard.visibility = View.VISIBLE
            optionButtonOne.visibility = View.INVISIBLE
            optionButtonTwo.visibility = View.INVISIBLE
            optionButtonThree.visibility = View.INVISIBLE
        } else {
            factCard.visibility = View.INVISIBLE
            optionButtonOne.visibility = View.VISIBLE
            optionButtonTwo.visibility = View.VISIBLE
            optionButtonThree.visibility = View.VISIBLE
        }
    }
}