package com.example.spring23e1app.Lecture78

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.spring23e1app.R

class Lecture78Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture78)
        Log.d("Lecture78","On created called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lecture78","On Start called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lecture78","On Resume called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lecture78","On Stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lecture78","On Destroy called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lecture78","On Pause called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lecture78","On Restart called")
    }
}