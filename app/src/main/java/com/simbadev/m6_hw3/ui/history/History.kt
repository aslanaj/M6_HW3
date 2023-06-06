package com.simbadev.m6_hw3.ui.history

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.simbadev.m6_hw3.MainViewModel
import com.simbadev.m6_hw3.databinding.FragmentHistoryBinding

class History : Fragment() {
    private lateinit var binding: FragmentHistoryBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        viewModel.operation.observe(viewLifecycleOwner) {
            binding.tvHistory.text = it
        }
    }
}