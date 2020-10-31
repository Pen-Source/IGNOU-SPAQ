package com.pensource.ignouspaq.ui.quiz.quiz

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pensource.ignouspaq.data.model.QuizQuestion
import com.pensource.ignouspaq.util.FakeData

class QuizQuestionViewModel @ViewModelInject constructor() : ViewModel() {

    private val _question = MutableLiveData<List<QuizQuestion>>().apply {
        value = FakeData.getFakeQuestion()
    }
    val question: LiveData<List<QuizQuestion>> = _question

    private val _currentQuestion = MutableLiveData<QuizQuestion>()
    val currentQuestion: LiveData<QuizQuestion> = _currentQuestion

    private val _questionNumber = MutableLiveData<Int>()
    val questionNumber: LiveData<Int> = _questionNumber

    fun loadCurrentQuestion(position: Int) {
        _currentQuestion.value = question.value?.get(position)
    }

    fun loadNextQuestion() {
        val totalQuestions = question.value?.size ?: -1
        val currentQuestion = questionNumber.value ?: -1

        if (totalQuestions != -1 && currentQuestion != -1) {
            if (currentQuestion + 1 > totalQuestions) {
                // End reached
            } else {
                _questionNumber.value = currentQuestion + 1
            }
        }
    }
}