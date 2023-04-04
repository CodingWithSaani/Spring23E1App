package com.example.spring23e1app.Lecture78

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.spring23e1app.R

class Lecture78cActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture78c)

        intent?.let {
            val userName = intent.getStringExtra("UserName")
            findViewById<TextView>(R.id.lecture78c_welcome_tv).text = userName

        }?:run {

        }
    }
}