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
//
//        questionList.add(
//            Question(
//                4,
//                context.getString(R.string.qFour),
//                R.drawable.ic_birthday_cake,
//                context.getString(R.string.qFour_optOne),
//                context.getString(R.string.qFour_optTwo),
//                context.getString(R.string.qFour_optThree),
//                context.getString(R.string.qFour_correctOpt),
//                context.getString(R.string.qFour_fact)
//            )
//        )
//
//        questionList.add(
//            Question(
//                5,
//                context.getString(R.string.qFive),
//                R.drawable.ic_toothpick,
//                context.getString(R.string.qFive_optOne),
//                context.getString(R.string.qFive_optTwo),
//                context.getString(R.string.qFive_optThree),
//                context.getString(R.string.qFive_correctOpt),
//                context.getString(R.string.qFive_fact)
//            )
//        )
//
//        questionList.add(
//            Question(
//                6,
//                context.getString(R.string.qSix),
//                R.drawable.ic_redlight,
//                context.getString(R.string.qSix_optOne),
//                context.getString(R.string.qSix_optTwo),
//                context.getString(R.string.qSix_optThree),
//                context.getString(R.string.qSix_correctOpt),
//                context.getString(R.string.qSix_fact)
//            )
//        )
//
//        questionList.add(
//            Question(
//                7,
//                context.getString(R.string.qSeven),
//                R.drawable.ic_brain,
//                context.getString(R.string.qSeven_optOne),
//                context.getString(R.string.qSeven_optTwo),
//                context.getString(R.string.qSeven_optThree),
//                context.getString(R.string.qSeven_correctOpt),
//                context.getString(R.string.qSeven_fact)
//            )
//        )
//
//        questionList.add(
//            Question(
//                8,
//                context.getString(R.string.qEight),
//                R.drawable.ic_lefthand,
//                context.getString(R.string.qEight_optOne),
//                context.getString(R.string.qEight_optTwo),
//                context.getString(R.string.qEight_optThree),
//                context.getString(R.string.qEight_correctOpt),
//                context.getString(R.string.qEight_fact)
//            )
//        )
//
//        questionList.add(
//            Question(
//                9,
//                context.getString(R.string.qNine),
//                R.drawable.ic_laughing,
//                context.getString(R.string.qNine_optOne),
//                context.getString(R.string.qNine_optTwo),
//                context.getString(R.string.qNine_optThree),
//                context.getString(R.string.qNine_correctOpt),
//                context.getString(R.string.qNine_fact)
//            )
//        )
//
//        questionList.add(
//            Question(
//                10,
//                context.getString(R.string.qTen),
//                R.drawable.ic_working_ant,
//                context.getString(R.string.qTen_optOne),
//                context.getString(R.string.qTen_optTwo),
//                context.getString(R.string.qTen_optThree),
//                context.getString(R.string.qTen_correctOpt),
//                context.getString(R.string.qTen_fact)
//            )
//        )

        return mutableListOf(q1, q2, q3)
    }
}