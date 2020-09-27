package com.example.funquiz

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    lateinit var questionsList: ArrayList<Question>
    var currentPosition: Int = 1
    var selectedOptionPosition: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        setQuestion()

    }

    private fun setQuestion() {
        questionsList = ListOfQuestions.getQuestions()

        val question = questionsList[currentPosition - 1]

        textViewProgress.text =
            "$currentPosition" + "/" + "${questionsList!!.size}" // ***** fråga hur jag flyttar upp den till the bar

        questionTextView.text = question.question
        imageView.setImageResource(question.image)
        optionButtonOne.text = question.optionOne
        optionButtonTwo.text = question.optionTwo
        optionButtonThree.text = question.optionThree

    }


    fun pressedButton(view: View) {
        questionsList = ListOfQuestions.getQuestions()

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
        optionButtonOne.visibility = View.INVISIBLE
        optionButtonTwo.visibility = View.INVISIBLE
        optionButtonThree.visibility = View.INVISIBLE
    }

    private fun selectedOption(selectedOption: String) {

        val question = questionsList[currentPosition - 1]
        if (question.correctOption == selectedOption) {
            resultTextView.text = "Rätt!"

            resultTextView.setTextColor(Color.parseColor("#00BB00"))

        } else {
            resultTextView.text ="$selectedOption" + " är fel!"

            resultTextView.setTextColor(Color.parseColor("#BB0000"))

        }
        factTextView.text="Svaret är "+"${question.correctOption}"+"\n\n"+"${question.fact}"


        factCard.visibility = View.VISIBLE
    }

    fun nextQuestionButton(view: View) {

        factCard.visibility = View.INVISIBLE

        optionButtonOne.visibility = View.VISIBLE
        optionButtonTwo.visibility = View.VISIBLE
        optionButtonThree.visibility = View.VISIBLE
        currentPosition++
        setQuestion()
    }

}