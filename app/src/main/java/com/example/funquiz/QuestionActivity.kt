package com.example.funquiz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
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


    var listOfQuestions: MutableList<Question> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        job = Job()
        db = AppDatabase.getInstance(this)

        // db.questionDao.clearTable()

        //CONTEXT PASSERAR HÄR = THIS, I FRAGMENT ÄR DET requireContext()
        //VILKET GÖR ATT DU KOMMER ÅT RESOURCES I ListOfQuestions -> gör att du kan göra getString() mm där
        val listOfQuest = ListOfQuestions(this).getQuestions()

        //LOOPA IGENOM VARJE question i LISTAN som skapas ovan
        listOfQuest.forEach {
            //it = Question - i denna loop
            Log.d("!!!", "Add questions function: $it")
            // addQuestion(it)
        }

        db.questionDao.getAllLiveData().observe(this, Observer {
            it.forEach {
                Log.d("!!!", "Observer list: ${it.question}")
            }
            listOfQuestions.addAll(it)
            createDots(listOfQuestions.size)
            setQuestion()
        })


//        question = listOfQuestions!![0]
//
//        launch {
//            Log.d("!!!", "LAUNCH LOAD ALL QUESTIONS $question")
//            val questions = loadAllQuestions()
//            Log.d("!!!", "QUESTIONS AWAITING $question")
//            val questionList = questions.await()
//
//            for (question in questionList) {
//                Log.d("!!!", "ITEM QUESTION IN DATABASE: $question")
//            }
//
//           // questionsList = ListOfQuestions(this).getQuestions()
//

//        }

    }

    fun addQuestion(question: Question) {
        Log.d("!!!", "ADDING $question")
        launch(Dispatchers.IO) {
            Log.d("!!!", "QuestionDao INSERT: $question")
            db.questionDao.insert(question)
        }
    }

//    fun loadAllQuestions(): Deferred<List<Question>> =
//        async(Dispatchers.IO){
//            Log.d("!!!", "Deferred List - Get All from questionDao: $question")
//            db.questionDao.getAll()
//        }


    private fun createDots(count: Int) {

        for (i in 0 until count) {

            val dotImage = ImageView(this)
            dotArray.add(dotImage)
            dotImage.setImageResource(R.drawable.ic_dot_inactive)
            dotLinearLayout.addView(dotImage)
        }
    }

    private fun setQuestion() {

        question = listOfQuestions[currentPosition]
        Log.d("!!!", "current quest: $question")

        dotArray[currentPosition].setImageResource(R.drawable.ic_dot_active)

        questionTextView.text = question.question
        //imageView.setImageResource(question.image)
        optionButtonOne.text = question.optionOne
        optionButtonTwo.text = question.optionTwo
        optionButtonThree.text = question.optionThree

        if (currentPosition < listOfQuestions.size.minus(1)) {
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

        if (currentPosition < listOfQuestions.size) {

            toggleButton(false)

            setQuestion()

        } else {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(CORRECT_ANSWERS, correctAnswers)
            intent.putExtra(TOTAL_QUESTIONS, listOfQuestions.size)
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
}