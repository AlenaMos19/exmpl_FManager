package com.example.task_3_livedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.task_3_livedata.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.textView2.text = "Bye!"
        binding.button2.setOnClickListener {
            navigator().showFirstFragment()
        }

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            SecondFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}