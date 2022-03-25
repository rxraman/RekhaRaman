package com.example.project2.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.project2.databinding.FragmentInputBinding


class InputFragment : Fragment() {
    private lateinit var binding: FragmentInputBinding
    var listener: CalcListener? = null

    interface CalcListener {
        fun setDisplay(input: String)
    }
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInputBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
       
        binding.one.setOnClickListener {
           listener?.setDisplay("1")
        }
        binding.two.setOnClickListener {
            listener?.setDisplay("2")
        }
        binding.three.setOnClickListener {
            listener?.setDisplay("3")
        }
        binding.four.setOnClickListener {
            listener?.setDisplay("4")
        }
        binding.five.setOnClickListener {
            listener?.setDisplay("5")
        }
        binding.six.setOnClickListener {
            listener?.setDisplay("6")
        }
        binding.seven.setOnClickListener {
            listener?.setDisplay("7")
        }
        binding.eight.setOnClickListener {
            listener?.setDisplay("8")
        }
        binding.nine.setOnClickListener {
            listener?.setDisplay("9")
        }
        binding.zero.setOnClickListener {
            listener?.setDisplay("0")
        }
        binding.sqrt.setOnClickListener {
            listener?.setDisplay("sqrt")
        }
        binding.c.setOnClickListener {
            listener?.setDisplay("C")
        }
        binding.ce.setOnClickListener {
            listener?.setDisplay("CE")
        }
        binding.plusMinus.setOnClickListener {
            listener?.setDisplay("PM")
        }
        binding.add.setOnClickListener {
            listener?.setDisplay("+")
        }
        binding.subtract.setOnClickListener {
            listener?.setDisplay("-")
        }
        binding.multiply.setOnClickListener {
            listener?.setDisplay("*")
        }
        binding.divide.setOnClickListener {
            listener?.setDisplay("/")
        }
        binding.modulus.setOnClickListener {
            listener?.setDisplay("%")
        }
        binding.del.setOnClickListener {
            listener?.setDisplay("DEL")
        }
        binding.equals.setOnClickListener {
            listener?.setDisplay("=")
        }
        binding.decimal.setOnClickListener {
            listener?.setDisplay(".")
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is CalcListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString())
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}