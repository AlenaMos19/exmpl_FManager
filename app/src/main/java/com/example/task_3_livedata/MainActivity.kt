package com.example.task_3_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.task_3_livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Navigator {

    private lateinit var binding: ActivityMainBinding

  //  private val currentFragment: Fragment?
  //      get() = supportFragmentManager.findFragmentById(R.id.fragmentContainer)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

            if (savedInstanceState == null){
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragmentContainer, FirstFragment())
                    .commit()
            }

    }

    override fun showFirstFragment() {
        launchFragment(FirstFragment())
    }

    override fun showSecondFragment() {
        launchFragment(SecondFragment())
    }

    private fun launchFragment(fragment: Fragment){

        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}

