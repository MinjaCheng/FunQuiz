package com.example.funquiz

object ListOfQuestions {

    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        questionList.add(Question(
            1,
            "Hur mycket tror du att American Airlines sparade per år när de 1987 tog bort en oliv från salladen som serverades i första klass?",
             R.drawable.ic_olive,
            "25 000 kr",
            "97 000 kr",
            "400 000 kr",
            "400 000 kr",
            "Under 1987 sparade American Airlines cirka 400 000 kr genom att ta bort en oliv från salladen som serverades i första klass. Ingen tycktes märka att antalet oliver minskats från fem till fyra."
        ))

        questionList.add(Question(
            2,
            "Vilket djur tror du orsakar flest människors död i världen?",
            R.drawable.ic_dead,
            "Ormar",
            "Mygg",
            "Den australienska kubmagneten",
            "Mygg",
            "Av alla jordens djur orsakar myggan fler dödsfall än något annat djur. Myggor sprider gula febern och malaria när de biter människor."
        ))

        questionList.add(Question(
            3,
            "3. Vad tror du väger mest?",
            R.drawable.ic_hippo,
            "Blåvalens tunga",
            "Elefant",
            "Flodhäst",
            "Blåvalens tunga",
            "De flesta elefanter väger faktiskt mindre än blåvalens tunga. Hela blåvalen (som blir upp till 30 m lång) kan väga upp till 150 ton, 200 ton enligt vissa, vilket motsvarar cirka 25 fullvuxna elefanter."
        ))

        questionList.add(Question(
            4,
            "Hur många människor behövs det för att uppnå 50 % chans att någon fyller år samma dag som du?",
            R.drawable.ic_birthday_cake,
            "23 personer",
            "100 personer",
            "3 000 personer",
            "23 personer",
            "Du delar din födelsedag med åtminstone 9 miljoner andra människor i världen. Det behövs alltså endast 23 människor i ett rum för att uppnå 50 % chans att någon har samma födelsedag som du."
        ))

        questionList.add(Question(
            5,
            "Hur många skadar sig varje år av tandpetare?",
            R.drawable.ic_toothpick,
            "150 personer",
            "2 500 personer",
            "8 800 personer",
            "8 800 personer",
            "8 800 klantskallar skadar sig själva varje år med en tandpetare."
        ))

        questionList.add(Question(
            6,
            "Hur många timmar tror du genomsnittsamerikanen spenderar under en livstid med att vänta vid rödljus?",
            R.drawable.ic_redlight,
            "2 veckor",
            "6 månader",
            "1 år",
            "6 månader",
            "Genomsnittsamerikanen spenderar i snitt 6 månader av sin livstid att vänta vid rödljus."
        ))

        questionList.add(Question(
            7,
            "Hur många procent av hjärnan tror du består av vatten?",
            R.drawable.ic_brain,
            "12 %",
            "42 %",
            "80 %",
            "80 %",
            "Totalt sett består kroppen till 70% av vatten. 90 % av kroppen består av väte, syre, kol och kväve."
        ))

        questionList.add(Question(
            8,
            "Hur många procent av befolkningen är vänsterhänta?",
            R.drawable.ic_lefthand,
            "3 %",
            "10 %",
            "20 %",
            "10 %",
            "Med fördelningen 9% kvinnor och 11 % män. Det kan även nämnas att högerhänta lever i genomsnitt 9 år längre än vänsterhänta."
        ))

        questionList.add(Question(
            9,
            "Hur många gånger per dag skrattar genomsnittspersonen?",
            R.drawable.ic_laughing,
            "1 gång",
            "3 gånger",
            "15 gånger",
            "15 gånger",
            "I snitt skrattar man runt 15 gånger per dag. Låter det mycket? Gör livet roligare då :-)"
        ))

        questionList.add(Question(
            10,
            "Hur mycket kan en arbetarmyra lyfta?",
            R.drawable.ic_working_ant,
            "50 gånger sin vikt",
            "60 gånger sin vikt",
            "80 gånger sin vikt",
            "50 gånger sin vikt",
            "Arbetarmyror kan lyfta 50 gånger sin vikt, och de kan dra 30 gånger sin vikt och när de förgiftas ramlar de alltid över på HÖGER sida."
        ))

        return questionList
    }
}