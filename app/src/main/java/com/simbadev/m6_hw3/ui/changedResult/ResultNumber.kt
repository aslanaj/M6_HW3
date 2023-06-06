package com.simbadev.m6_hw3.ui.changedResult

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.simbadev.m6_hw3.MainViewModel
import com.simbadev.m6_hw3.databinding.FragmentResultNumberBinding


class ResultNumber : Fragment() {


    private lateinit var binding: FragmentResultNumberBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultNumberBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCount.text = it.toString()
        }
    }
}