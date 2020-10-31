package com.pensource.ignouspaq.ui.quiz.quiz

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pensource.ignouspaq.data.model.QuizQuestion

class QuizQuestionViewModel @ViewModelInject constructor() : ViewModel() {

    private val _question = MutableLiveData<List<QuizQuestion>>()
    val question: LiveData<List<QuizQuestion>> = _question

    private val _currentQuestion = MutableLiveData<QuizQuestion>()
    val currentQuestion: LiveData<QuizQuestion> = _currentQuestion

    private val _questionNumber = MutableLiveData<Int>()
    val questionNumber: LiveData<Int> = _questionNumber

    fun loadCurrentQuestion(position: Int) {
        _currentQuestion.value = question.value?.get(position)
    }
}