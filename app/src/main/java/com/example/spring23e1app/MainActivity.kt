package com.example.spring23e1app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.spring23e1app.Lecture1011.Lecture1011Activity
import com.example.spring23e1app.Lecture12.Lecture12Activity
import com.example.spring23e1app.Lecture13.Lecture13Activity
import com.example.spring23e1app.Lecture5.Lec5Activity
import com.example.spring23e1app.Lecture78.Lecture78Activity
import com.example.spring23e1app.Lecture78.Lecture78aActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.start_screen_btn).setOnClickListener {
            //val intent = Intent(MainActivity@this,Lec5Activity::class.java)
            startActivity(Intent(MainActivity@this,Lec5Activity::class.java))

        }

        findViewById<Button>(R.id.lecture78_btn).setOnClickListener {
            //val intent = Intent(MainActivity@this,Lec5Activity::class.java)
            startActivity(Intent(MainActivity@this,Lecture78Activity::class.java))

        }

        findViewById<Button>(R.id.lecture78_a_btn).setOnClickListener {
            //val intent = Intent(MainActivity@this,Lec5Activity::class.java)
            startActivity(Intent(MainActivity@this,Lecture78aActivity::class.java))

        }

        findViewById<Button>(R.id.lecture1011_btn).setOnClickListener {
            //val intent = Intent(MainActivity@this,Lec5Activity::class.java)
            //startActivity(Intent(MainActivity@this,Lecture1011Activity::class.java))

            startActivity(Intent(MainActivity@this, Lecture13Activity::class.java))

        }
    }
}