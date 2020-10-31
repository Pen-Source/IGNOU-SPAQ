package com.pensource.ignouspaq.util

import com.pensource.ignouspaq.data.model.QuizQuestion

class FakeData {

    companion object {

        fun getFakeQuestion(): List<QuizQuestion> {
            return listOf(
                QuizQuestion(
                    "Which is fastest animal?",
                    listOf("Cheetah", "Zebra", "Lion", "Elephant"),
                    0,
                    60
                ),
                QuizQuestion(
                    "Which is smallest animal?",
                    listOf("Cheetah", "Ant", "Lion", "Elephant"),
                    1,
                    60
                ),
                QuizQuestion(
                    "Which is largest animal?",
                    listOf("Cheetah", "Zebra", "Lion", "Elephant"),
                    3,
                    60
                ),
                QuizQuestion(
                    "Which is tallest animal?",
                    listOf("Cheetah", "Zebra", "Giraffe", "Elephant"),
                    0,
                    60
                )
            )
        }
    }
}