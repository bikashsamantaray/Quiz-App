package com.bikash.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answer"


    fun getQuestions():ArrayList<Questions>{
        val questionList = ArrayList<Questions>()


        val que1 = Questions(
            1, "what country does this flag belongs to?",R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "India", "Germany",1
        )

        questionList.add(que1)

        val que2 = Questions(
            2, "what country does this flag belongs to?",R.drawable.ic_flag_of_india,
            "Argentina", "Austria", "India", "NewZealand",3
        )

        questionList.add(que2)

        val que3 = Questions(
            3, "what country does this flag belongs to?",R.drawable.ic_flag_of_kuwait,
            "Australia", "Kuwait", "Afghanistan", "Brazil",2
        )

        questionList.add(que3)

        val que4 = Questions(
            4, "what country does this flag belongs to?", R.drawable.ic_flag_of_germany,
            "Brazil", "Chile", "India", "Germany",4
        )

        questionList.add(que4)

        val que5 = Questions(
            5, "what country does this flag belongs to?", R.drawable.ic_flag_of_fiji,
            "Bangladesh", "Fiji", "Pakistan", "India",2
        )

        questionList.add(que5)

        val que6 = Questions(
            6, "what country does this flag belongs to?", R.drawable.ic_flag_of_new_zealand,
            "NewZealand", "Australia", "Pakistan", "Kuwait",1
        )

        questionList.add(que6)

        val que7 = Questions(
            7, "what country does this flag belongs to?", R.drawable.ic_flag_of_brazil,
            "Brazil", "IceLand", "Indonesia", "Japan",1
        )

        questionList.add(que7)

        val que8 = Questions(
            8, "what country does this flag belongs to?",R.drawable.ic_flag_of_denmark,
            "Jamaica", "Australia", "Iraq", "Denmark",4
        )

        questionList.add(que8)

        val que9 = Questions(
            9, "what country does this flag belongs to?", R.drawable.ic_flag_of_belgium,
            "Argentina", "Australia", "Belgium", "Germany",3
        )

        questionList.add(que9)

        val que10 = Questions(
            1, "what country does this flag belongs to?", R.drawable.ic_flag_of_australia,
            "NewZealand", "Australia", "Brazil", "SriLanka",2
        )

        questionList.add(que10)
        return questionList
    }
}