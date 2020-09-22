package com.example.funquiz

object ListOfQuestions {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val q1 = Question(
            1,
            "Hur mycket tror du att American Airlines sparade per år när de 1987 tog bort en oliv från salladen som serverades i första klass?",
             R.drawable.olive,
            "25 000 kr",
            "97 000 kr",
            "400 000 kr",
            3
        )

        questionList.add(q1)

        val q2 = Question(
            2,
            "Vilket djur tror du orsakar flest människors död i världen?",
            R.drawable.dead,
            "Ormar",
            "Mygg",
            "Den australienska kubmagneten",
            2
        )

        questionList.add(q2)

        val q3 = Question(
            3,
            "3. Vad tror du väger mest?",
            R.drawable.hippo,
            "Blåvalens tunga",
            "Elefant",
            "Flodhäst",
            1
        )

        questionList.add(q3)

        val q4 = Question(
            4,
            "Hur många människor behövs det för att uppnå 50 % chans att någon fyller år samma dag som du?",
            R.drawable.birthday_cake,
            "23 personer",
            "100 personer",
            "3000 personer",
            1
        )

        questionList.add(q4)

        val q5 = Question(
            5,
            "Hur många skadar sig varje år av tandpetare?",
            R.drawable.toothpick,
            "150 personer",
            "2 500 personer",
            "8 800 personer",
            3
        )

        questionList.add(q5)

        val q6 = Question(
            6,
            "Hur många timmar tror du genomsnittsamerikanen spenderar under en livstid med att vänta vid rödljus?",
            R.drawable.redlight,
            "2 veckor",
            "6 månader",
            "1 år",
            2
        )
        questionList.add(q6)

        val q7 = Question(
            7,
            "Hur många procent av hjärnan tror du består av vatten?",
            R.drawable.brain,
            "12 %",
            "42 %",
            "80 %",
            3
        )

        questionList.add(q7)

        val q8 = Question(
            8,
            "Hur många procent av befolkningen är vänsterhänta?",
            R.drawable.lefthand,
            "3 %",
            "10 %",
            "20 %",
            2
        )
        
        questionList.add(q8)

        return questionList
    }
}