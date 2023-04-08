package com.example.task_3_livedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.task_3_livedata.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.textView1.text = "Hello"
        binding.button1.setOnClickListener {
            navigator().showSecondFragment()
        }
        return binding.root
    }

    companion object {

        private val ARG_PARAM = "ARG"
        @JvmStatic
        fun newInstance(param: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM, param)
                }
            }
    }
}