package com.example.task_3_livedata

import androidx.fragment.app.Fragment

fun Fragment.navigator(): Navigator{
    return requireActivity() as Navigator
}

interface Navigator {

    fun showFirstFragment()

    fun showSecondFragment()
}