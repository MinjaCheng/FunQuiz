package com.example.funquiz

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat


class ListOfQuestions(context: Context) {

    val res = context.resources

    fun getQuestions(): MutableList<Question> {


        val q1 =
            Question(
                1,
                res.getString(R.string.qOne),
                1,
                res.getString(R.string.qOne_optOne),
                res.getString(R.string.qOne_optTwo),
                res.getString(R.string.qOne_optThree),
                res.getString(R.string.qOne_correctOpt),
                res.getString(R.string.qOne_fact)
            )


        val q2 =
            Question(
                2,
                res.getString(R.string.qTwo),
                2,
                res.getString(R.string.qTwo_optOne),
                res.getString(R.string.qTwo_optTwo),
                res.getString(R.string.qTwo_optThree),
                res.getString(R.string.qTwo_correctOpt),
                res.getString(R.string.qTwo_fact)
            )

        val q3 =
            Question(
                3,
                res.getString(R.string.qThree),
                3,
                res.getString(R.string.qThree_optOne),
                res.getString(R.string.qThree_optTwo),
                res.getString(R.string.qThree_optThree),
                res.getString(R.string.qThree_correctOpt),
                res.getString(R.string.qThree_fact)
            )

        val q4 =
            Question(
                4,
                res.getString(R.string.qFour),
                4,
                res.getString(R.string.qFour_optOne),
                res.getString(R.string.qFour_optTwo),
                res.getString(R.string.qFour_optThree),
                res.getString(R.string.qFour_correctOpt),
                res.getString(R.string.qFour_fact)
            )

        val q5 =
            Question(
                5,
                res.getString(R.string.qFive),
                5,
                res.getString(R.string.qFive_optOne),
                res.getString(R.string.qFive_optTwo),
                res.getString(R.string.qFive_optThree),
                res.getString(R.string.qFive_correctOpt),
                res.getString(R.string.qFive_fact)
            )
        

        val q6 =
            Question(
                6,
                res.getString(R.string.qSix),
                6,
                res.getString(R.string.qSix_optOne),
                res.getString(R.string.qSix_optTwo),
                res.getString(R.string.qSix_optThree),
                res.getString(R.string.qSix_correctOpt),
                res.getString(R.string.qSix_fact)
            )

        val q7 =
            Question(
                7,
                res.getString(R.string.qSeven),
                7,
                res.getString(R.string.qSeven_optOne),
                res.getString(R.string.qSeven_optTwo),
                res.getString(R.string.qSeven_optThree),
                res.getString(R.string.qSeven_correctOpt),
                res.getString(R.string.qSeven_fact)
            )

        val q8 =
            Question(
                8,
                res.getString(R.string.qEight),
                8,
                res.getString(R.string.qEight_optOne),
                res.getString(R.string.qEight_optTwo),
                res.getString(R.string.qEight_optThree),
                res.getString(R.string.qEight_correctOpt),
                res.getString(R.string.qEight_fact)
            )


        val q9 =
            Question(
                9,
                res.getString(R.string.qNine),
                9,
                res.getString(R.string.qNine_optOne),
                res.getString(R.string.qNine_optTwo),
                res.getString(R.string.qNine_optThree),
                res.getString(R.string.qNine_correctOpt),
                res.getString(R.string.qNine_fact)
            )

        val q10 =
            Question(
                10,
                res.getString(R.string.qTen),
                10,
                res.getString(R.string.qTen_optOne),
                res.getString(R.string.qTen_optTwo),
                res.getString(R.string.qTen_optThree),
                res.getString(R.string.qTen_correctOpt),
                res.getString(R.string.qTen_fact)
            )

        return mutableListOf(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10)
    }
}