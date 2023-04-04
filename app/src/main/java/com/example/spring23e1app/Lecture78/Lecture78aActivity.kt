package com.example.spring23e1app.Lecture78

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.spring23e1app.R
import com.google.android.material.textfield.TextInputEditText

class Lecture78aActivity : AppCompatActivity() {

    private lateinit var nameET:TextInputEditText
    private lateinit var emailET:TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture78a)

        nameET = findViewById(R.id.lecture78a_name_et)
        emailET = findViewById(R.id.lecture78a_email_et)

        findViewById<Button>(R.id.lecture78a_check_name_btn).setOnClickListener {
            checkUserAndSendData()
        }
    }

    private fun checkUserAndSendData() {
        if(nameET.text.toString().isNotEmpty() && emailET.text.toString().isNotEmpty())
        {
            var intent = Intent(Lecture78aActivity@this,Lecture78cActivity::class.java)
            intent.putExtra("UserName",nameET.text.toString())

            intent.putExtra("UserEmail",emailET.text.toString())
            startActivity(intent)
        }
        else if(nameET.text.toString().isEmpty())
        {

        }
        else if(emailET.text.toString().isEmpty())
        {

        }
        else
        {

        }
    }
}