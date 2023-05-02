package com.example.spring23e1app.Lecture13

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat
import com.example.spring23e1app.R

class Lecture13Activity : AppCompatActivity() {

    private val getPermissionBtn:Button by lazy{
        findViewById(R.id.get_permission_btn)
    }

    private val permissionTV:TextView by lazy{
        findViewById(R.id.permission_tv)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture13)

        checkLocationPermission()
    }

    private fun checkLocationPermission() {
        if(
            ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            )==PackageManager.PERMISSION_GRANTED
        )
        {
            //do the magic
        }
        else
        {
            ActivityCompat.requestPermissions(
                Lecture13Activity@this,
                arrayOf(
                    android.Manifest.permission.ACCESS_FINE_LOCATION
                ),
                191
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==191)
        {
            if(grantResults.isNotEmpty() &&
                grantResults[0]==PackageManager.PERMISSION_GRANTED)
            {
                permissionTV.text ="Permission Granted"
            }
        }
    }
}












