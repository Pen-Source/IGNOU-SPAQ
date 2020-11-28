package com.pensource.ignouspaq.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.pensource.ignouspaq.R
import com.pensource.ignouspaq.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.layout_home_items.view.*

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false).apply {
            viewmodel = viewModel
            lifecycleOwner = this@HomeFragment
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.courseLayout.run {
            title_text_view.text = "Courses"
            image_view.setImageResource(R.drawable.ic_baseline_school_24)
        }

        binding.quizLayout.run {
            title_text_view.text = "Quiz"
            image_view.setImageResource(R.drawable.ic_baseline_history_toggle_off_24)
        }
    }
}