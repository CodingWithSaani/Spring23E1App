package com.example.spring23e1app.Lecture5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.spring23e1app.MainActivity
import com.example.spring23e1app.R

class Lec5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lec5)

        var firstValueET:EditText = findViewById(R.id.first_value_et)
        var secondVlaueET:EditText = findViewById(R.id.second_value_et)

        var magicBtn: Button = findViewById(R.id.magic_btn)
        var resultTV: TextView = findViewById(R.id.result_tv)

        magicBtn.setOnClickListener {

            if(firstValueET.text.toString().isNotEmpty() &&
                secondVlaueET.text.toString().isNotEmpty())
            {
                var firstValue = firstValueET.text.toString().toInt()
                var secondValue = secondVlaueET.text.toString().toInt()

                var result = firstValue+secondValue
                resultTV.text = "${getString(R.string.result_tv)} $result"
            }
            else if(firstValueET.text.toString().isEmpty())
            {
                Toast.makeText(MainActivity@this, "Please enter the value in first et"
                    , Toast.LENGTH_SHORT).show()

                firstValueET.requestFocus()
            }
            else if(secondVlaueET.text.toString().isEmpty())
            {
                Toast.makeText(MainActivity@this, "Please enter the value in second et"
                    , Toast.LENGTH_SHORT).show()

                secondVlaueET.requestFocus()
            }
            else
            {
                Toast.makeText(this, "Please check your code!!!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}