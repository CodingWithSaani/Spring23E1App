package com.example.spring23e1app.Lecture12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.example.spring23e1app.R

class Lecture12Activity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture12)

        if(savedInstanceState == null) {
            findViewById<FragmentContainerView>(R.id.container)?.let {
                val parentFragment = ParentFragment()
                supportFragmentManager.beginTransaction().add(it.id, parentFragment).commit()
            }
        }
    }

    override fun communicateData(string: String) {
        findViewById<FragmentContainerView>(R.id.container)?.let {
            val childFragment = ChildFragment.newInstance(string)
            supportFragmentManager.beginTransaction().replace(it.id, childFragment).commit()
        }
    }
}