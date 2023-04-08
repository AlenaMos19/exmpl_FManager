package com.example.task_3_livedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.task_3_livedata.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var bindind: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindind = FragmentFirstBinding.inflate(inflater, container, false)

        bindind.textView1.text = "Hello"
        bindind.button1.setOnClickListener {
            navigator().showSecondFragment()
        }
        return bindind.root
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