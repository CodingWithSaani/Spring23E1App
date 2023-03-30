package com.example.spring23e1app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.spring23e1app.Lecture5.Lec5Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.start_screen_btn).setOnClickListener {
            //val intent = Intent(MainActivity@this,Lec5Activity::class.java)
            startActivity(Intent(MainActivity@this,Lec5Activity::class.java))

        }
    }
}