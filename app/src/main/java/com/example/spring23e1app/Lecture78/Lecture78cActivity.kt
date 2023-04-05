package com.example.spring23e1app.Lecture78

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.spring23e1app.R

class Lecture78cActivity : AppCompatActivity() {

    private var userNames = listOf("Ali","Fahad","Ayesha","Noman")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture78c)

        intent?.let {
            if(it.hasExtra("UserName"))
            {
                val userName = intent.getStringExtra("UserName")
                if(userNames.contains(userName))
                {
                    findViewById<TextView>(R.id.lecture78c_welcome_tv).text =
                        "Welcome $userName"
                }
                else
                {
                    findViewById<TextView>(R.id.lecture78c_welcome_tv).text = "Sorry you" +
                            "are not on list"
                }

            }
            else
            {

            }


        }?:run {

        }
    }
}