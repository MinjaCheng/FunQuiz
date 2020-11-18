package com.example.funquiz

import android.content.Context


class ListOfQuestions(context: Context) {

    val res = context.resources

    fun getQuestions(): MutableList<Question> {

        val q1 =
            Question(
                1,
                res.getString(R.string.qOne),
                R.drawable.ic_dead,
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
                R.drawable.ic_dead,
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
                R.drawable.ic_hippo,
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
                R.drawable.ic_birthday_cake,
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
                R.drawable.ic_toothpick,
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
                R.drawable.ic_redlight,
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
                R.drawable.ic_brain,
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
                R.drawable.ic_lefthand,
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
                R.drawable.ic_laughing,
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
                R.drawable.ic_working_ant,
                res.getString(R.string.qTen_optOne),
                res.getString(R.string.qTen_optTwo),
                res.getString(R.string.qTen_optThree),
                res.getString(R.string.qTen_correctOpt),
                res.getString(R.string.qTen_fact)
            )

        return mutableListOf(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10)
    }
}