package com.simbadev.m6_hw3.ui.buttons

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.simbadev.m6_hw3.MainViewModel
import com.simbadev.m6_hw3.databinding.FragmentButtonIncreaseBinding

class ButtonIncrease : Fragment() {

    private lateinit var binding: FragmentButtonIncreaseBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentButtonIncreaseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[(MainViewModel::class.java)]



        binding.plus.setOnClickListener {
            viewModel.increment()
        }

        binding.minus.setOnClickListener {
            viewModel.decrement()
        }
    }
}