package com.example.sensingcrowd

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import java.io.IOException
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.LocationServices

var currentPlace : Location? = null
var mLocationPermissionGranted = false
val REQUEST_LIGHT_TEMP_CAPTURE = 1
val REQUEST_IMAGE_CAPTURE = 2
val REQUEST_NOISE_CAPTURE = 3
val REQUEST_RSSI_CAPTURE = 4
val PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 5

class Home : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        getLocationPermission()

        getDeviceLocation(this)

        AddTaskBtn.setOnClickListener{
            val intent = Intent(this, AddTask::class.java)
            startActivity(intent)
        }
        RespondTaskBtn.setOnClickListener{
            val intent = Intent(this, RespondTask::class.java)
            startActivity(intent)
        }
    }

    fun getLocationPermission(){
        if (ContextCompat.checkSelfPermission(this.getApplicationContext(),
                android.Manifest.permission.ACCESS_FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED) {
            mLocationPermissionGranted = true
        } else {
            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION)
        }
    }
}

@SuppressLint("MissingPermission")
fun getDeviceLocation(context: Context){
    val mFusionLocationProviderClient = LocationServices.getFusedLocationProviderClient(context)
    try {
        if (mLocationPermissionGranted){
            val location = mFusionLocationProviderClient.lastLocation
            location.addOnCompleteListener{
            }
        }
    } catch(ex : IOException){
        println("getDeviceLocation: $ex")
    }
}

