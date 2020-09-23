package com.example.funquiz

object ListOfQuestions {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val q1 = questionList.add(Question(
            1,
            "Hur mycket tror du att American Airlines sparade per år när de 1987 tog bort en oliv från salladen som serverades i första klass?",
             R.drawable.olive,
            "25 000 kr",
            "97 000 kr",
            "400 000 kr",
            3,
            "Under 1987 sparade American Airlines cirka 400 000 kr genom att ta bort en oliver från salladen som serverades i första klass. Ingen tycktes märka att antalet oliver minskats från fem till fyra."
        ))

        val q2 = questionList.add(Question(
            2,
            "Vilket djur tror du orsakar flest människors död i världen?",
            R.drawable.dead,
            "Ormar",
            "Mygg",
            "Den australienska kubmagneten",
            2,
            "Av alla jordens djur orsakar myggan fler dödsfall än något annat djur. Myggor sprider gula febern och malaria när de biter människor."

        ))

        val q3 = questionList.add(Question(
            3,
            "3. Vad tror du väger mest?",
            R.drawable.hippo,
            "Blåvalens tunga",
            "Elefant",
            "Flodhäst",
            1,
            "De flesta elefanter väger faktiskt mindre än blåvalens tunga. Hela blåvalen (som blir upp till 30 m lång) kan väga upp till 150 ton, 200 ton enligt vissa, vilket motsvarar cirka 25 fullvuxna elefanter."
        ))

        val q4 = questionList.add(Question(
            4,
            "Hur många människor behövs det för att uppnå 50 % chans att någon fyller år samma dag som du?",
            R.drawable.birthday_cake,
            "23 personer",
            "100 personer",
            "3000 personer",
            1,
            "Du delar din födelsedag med åtminstone 9 miljoner andra människor i världen. Det behövs alltså endast 23 människor i ett rum för att uppnå 50 % chans att någon har samma födelsedag som du."
        ))

        val q5 = questionList.add(Question(
            5,
            "Hur många skadar sig varje år av tandpetare?",
            R.drawable.toothpick,
            "150 personer",
            "2 500 personer",
            "8 800 personer",
            3,
            "8 800 klantskallar skadar sig själva varje år med en tandpetare."
        ))

        val q6 = questionList.add(Question(
            6,
            "Hur många timmar tror du genomsnittsamerikanen spenderar under en livstid med att vänta vid rödljus?",
            R.drawable.redlight,
            "2 veckor",
            "6 månader",
            "1 år",
            2,
            "Genomsnittsamerikanen spenderar i snitt 6 månader av sin livstid att vänta vid rödljus."
        ))

        val q7 = questionList.add(Question(
            7,
            "Hur många procent av hjärnan tror du består av vatten?",
            R.drawable.brain,
            "12 %",
            "42 %",
            "80 %",
            3,
            "Totalt sett består kroppen till 70% av vatten. 90 % av kroppen består av väte, syre, kol och kväve."
        ))

        val q8 = questionList.add(Question(
            8,
            "Hur många procent av befolkningen är vänsterhänta?",
            R.drawable.lefthand,
            "3 %",
            "10 %",
            "20 %",
            2,
            "Med fördelningen 9% kvinnor och 11 % män. Det kan även nämnas att högerhänta lever i genomsnitt 9 år längre än vänsterhänta."
        ))

        return questionList
    }
}