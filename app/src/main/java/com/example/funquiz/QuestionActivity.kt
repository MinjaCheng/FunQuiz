package com.example.funquiz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    lateinit var questionsList: ArrayList<Question>
    lateinit var question: Question
    private var currentPosition: Int = 0
    private var correctAnswers: Int = 0
    private var dotArray = mutableListOf<ImageView>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        questionsList = ListOfQuestions.getQuestions()
        createDots(questionsList.size)
        setQuestion()

    }

    private fun createDots (count: Int){

        for (i in 0 until count){
            val dotImage = ImageView(this)
            dotArray.add(dotImage)
            dotImage.setImageResource(R.drawable.ic_dot_inactive)
            dotLinearLayout.addView(dotImage)

        }
    }

    private fun setQuestion() {

        question = questionsList[currentPosition]

        dotArray[currentPosition].setImageResource(R.drawable.ic_dot_active)

        questionTextView.text = question.question
        imageView.setImageResource(question.image)
        optionButtonOne.text = question.optionOne
        optionButtonTwo.text = question.optionTwo
        optionButtonThree.text = question.optionThree

        if (currentPosition < questionsList.size -1) {
            nextQueButton.text = getString(R.string.nextQueButton_next)
        } else {
            nextQueButton.text = getString(R.string.nextQueButton_finish)
        }

    }


    fun pressedButton(view: View) {

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

    @SuppressLint("StringFormatMatches")
    private fun selectedOption(selectedOption: String) {

        if (question.correctOption == selectedOption) {

            correctAnswerTextView.text = getString(R.string.correctAnswer_correct)
            correctAnswerTextView.setTextColor(Color.parseColor("#00BB00"))
            dotArray[currentPosition].setImageResource(R.drawable.ic_dot_correct)
            correctAnswers++

        } else {
            correctAnswerTextView.text = getString(R.string.correctAnswer_wrong, selectedOption)
            correctAnswerTextView.setTextColor(Color.parseColor("#BB0000"))
            dotArray[currentPosition].setImageResource(R.drawable.ic_dot_incorrect)
        }
        factTextView.text = getString(R.string.fact, question.correctOption, question.fact)
    }

    fun nextQuestionButton(view: View) {

        if (currentPosition < questionsList.size) {

            toggleButton(false)

            setQuestion()

        } else {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(ListOfQuestions.CORRECT_ANSWERS, correctAnswers)
            intent.putExtra(ListOfQuestions.TOTAL_QUESTIONS, questionsList.size)
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