package com.pensource.ignouspaq.data.model

data class QuizQuestion(
    val question: String,
    val answer: List<String>,
    val correctIndex: Int,
    val maxTime: Int
)