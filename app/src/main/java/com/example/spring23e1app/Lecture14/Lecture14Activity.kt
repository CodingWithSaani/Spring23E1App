package com.example.spring23e1app.Lecture14

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.example.spring23e1app.R
import com.example.spring23e1app.databinding.ActivityLecture14Binding


private const val REQUEST_CODE= 400
class Lecture14Activity : AppCompatActivity() {

    private val mLecture14ActivityBinding by lazy {
        ActivityLecture14Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(mLecture14ActivityBinding.root)
    }

    override fun onStart() {
        super.onStart()
        mLecture14ActivityBinding.lec14GetBtn.setOnClickListener {
            startLocationGettingProcess()
        }
    }

    private fun startLocationGettingProcess() {
        if(
            ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            )==
                    PackageManager.PERMISSION_GRANTED
        )
        {
            //do the magic
        }
        else
        {
            ActivityCompat.requestPermissions(
                Lecture14Activity@this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                REQUEST_CODE
            )
        }
    }
}














