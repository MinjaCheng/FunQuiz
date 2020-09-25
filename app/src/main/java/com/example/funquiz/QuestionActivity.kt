package com.example.funquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity(){

    private var currentPosition: Int = 1
    private var questionsList: ArrayList<Question>? = null
    private var selectedOptionPosition: Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        setQuestion()

    }

    private fun setQuestion(){
        questionsList = ListOfQuestions.getQuestions()

        currentPosition = 1
        val question = questionsList!![currentPosition - 1]

        textViewProgress.text = "$currentPosition" + "/" + "${questionsList!!.size}"

        questionTextView.text = question!!.question
        imageView.setImageResource(question.image)
        optionButtonOne.text = question.optionOne
        optionButtonTwo.text = question.optionTwo
        optionButtonThree.text = question.optionThree
    }

    /*private fun defaultOptionsView(){
        val options = ArrayList<Button>()
        options.add(0,optionButtonOne)
        options.add(1,optionButtonTwo)
        options.add(2, optionButtonThree)

        for (option in options){
            option.typeface = Typeface.DEFAULT
        }
    }*/

    fun addFactFragment(view: View) {

        val factFragment = FactFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.viewFact, factFragment, "factFragment")
        transaction.commit()
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 -> {
                optionButtonOne.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                optionButtonTwo.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                optionButtonThree.background = ContextCompat.getDrawable(this, drawableView)
            }
            }
        }

    }

}