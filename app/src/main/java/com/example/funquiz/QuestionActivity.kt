package com.example.funquiz

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
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

    private fun setQuestion(){
        questionsList = ListOfQuestions.getQuestions()

        val question = questionsList[currentPosition - 1]

        textViewProgress.text = "$currentPosition" + "/" + "${questionsList!!.size}" // ***** fråga hur jag flyttar upp den till the bar

        questionTextView.text = question.question
        imageView.setImageResource(question.image)
        optionButtonOne.text = question.optionOne
        optionButtonTwo.text = question.optionTwo
        optionButtonThree.text = question.optionThree
    }


    fun pressedButton(view: View) {

        when (view.id) {
            R.id.optionButtonOne -> {
                selectedOption(1)
            }
            R.id.optionButtonTwo -> {
                selectedOption(2)
            }
            R.id.optionButtonThree -> {
                selectedOption(3)
            }
        }
    }

    private fun selectedOption(selectedOptionNum: Int) {

        selectedOptionPosition = selectedOptionNum

        if (selectedOptionPosition > 0) {
            val question = questionsList.get(currentPosition - 1)
            if (question.correctOption == selectedOptionPosition) {
                //addFactFragment() // ********* Lägga till text

            }else {
                //addFactFragment()
            }
            currentPosition ++
            setQuestion()  // ******** ska tas bort senare
        }


    }

    fun addFactFragment() {
        val factFragment = FactFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.viewFact, factFragment, "factFragment")
        transaction.commit()
    }

    /*fun changeText() {
        val fragment = supportFragmentManager.findFragmentByTag("factFragment") as FactFragment?

        fragment?.setText("Testing testing")
    }

    fun nextQuestionButton(view: View) {

        when {
                currentPosition <= questionsList!!.size -> {
                    setQuestion()
                }else ->{
                Toast.makeText(this,"Finish", Toast.LENGTH_SHORT).show()
            }
            }
    }*/

}