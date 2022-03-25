package com.example.project2.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.project2.R
import com.example.project2.databinding.MainFragmentBinding
import androidx.lifecycle.Observer
import android.content.Context
import android.widget.Toast


class MainFragment : Fragment() {
    private lateinit var binding: MainFragmentBinding

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    fun changeDisplay(input: String){
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
       viewModel.setExpression(input)
        val resultObserver = Observer<String>{
                result -> binding.resultText.text=result.toString()
        }
        viewModel.getResult().observe(viewLifecycleOwner, resultObserver)

    }

}