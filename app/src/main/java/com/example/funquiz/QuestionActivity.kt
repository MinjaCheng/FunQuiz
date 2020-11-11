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
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

const val TOTAL_QUESTIONS: String = "total_questions"
const val CORRECT_ANSWERS: String = "correct_answers"

class QuestionActivity : AppCompatActivity(), CoroutineScope {

    private lateinit var job: Job
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    private lateinit var questionsList: ListOfQuestions
    lateinit var question: Question
    private var currentPosition: Int = 0
    private var correctAnswers: Int = 0
    private var dotArray = mutableListOf<ImageView>()

    private lateinit var db: AppDatabase


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        job = Job()
        db = AppDatabase.getInstance(this)
/*
        addQuestion(Question(
            0,
            "Hur mycket tror du att American Airlines sparade per år när de 1987 tog bort en oliv från salladen som serverades i första klassen?",
            "ic_olive",
            "25 000 kr",
            "97 000 kr",
            "400 000 kr",
            "400 000 kr",
            "Under 1987 sparade American Airlines ca 400 000 kr genom att ta bort en oliv från salladen som serverades i första klassen. Ingen tycktes märka att antalet oliver minskats från 5 till 4."
        ))
*/
        loadAllWords()

     //   questionsList = ListOfQuestions(this).getQuestions()
     //   createDots(questionsList.size)

    //   setQuestion()
    }

    private fun addQuestion(question: Question) {

        launch(Dispatchers.IO) {
            db.questionDao.insert(question)
        }
    }

    fun loadAllWords() {
        val words = async(Dispatchers.IO){
            db.questionDao.getAll()
        }

        launch {
            val list = words.await().toMutableList()
            questionsList = ListOfQuestions(list)
        }
    }
/*
    private fun createDots(count: Int) {

        for (i in 0 until count) {

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

        if (currentPosition < questionsList.size - 1) {
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
            intent.putExtra(CORRECT_ANSWERS, correctAnswers)
            intent.putExtra(TOTAL_QUESTIONS, questionsList.size)
            startActivity(intent)
        }
    }

    private fun toggleButton(toggle: Boolean) {

        if (toggle) {
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
*/
}