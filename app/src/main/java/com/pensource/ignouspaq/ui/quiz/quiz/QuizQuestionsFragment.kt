package com.pensource.ignouspaq.ui.quiz.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.pensource.ignouspaq.databinding.FragmentQuizQuestionsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuizQuestionsFragment : Fragment() {

    private val viewModel: QuizQuestionViewModel by viewModels()

    private lateinit var binding: FragmentQuizQuestionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuizQuestionsBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = this@QuizQuestionsFragment
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.submitButton.setOnClickListener {
            viewModel.loadNextQuestion()
        }

        viewModel.questionNumber.observe(viewLifecycleOwner, Observer { position ->
            viewModel.loadCurrentQuestion(position)
        })

        viewModel.currentQuestion.observe(viewLifecycleOwner, Observer { question ->
            binding.run {
                quizQuestionLayout.questionText.text = question.question

                answerOne.answerText.text = question.answer[0]
                answerTwo.answerText.text = question.answer[1]
                answerThree.answerText.text = question.answer[2]
                answerFour.answerText.text = question.answer[3]
            }
        })
    }
}