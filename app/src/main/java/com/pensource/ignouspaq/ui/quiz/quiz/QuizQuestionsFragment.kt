package com.pensource.ignouspaq.ui.quiz.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pensource.ignouspaq.databinding.FragmentQuizStartBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuizQuestionsFragment : Fragment() {

    private lateinit var binding: FragmentQuizStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuizStartBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = this@QuizQuestionsFragment
        }
        return binding.root
    }

}