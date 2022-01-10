package com.example.sensingcrowd

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_task.*

class AddTask : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_task)

        btn_previous.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        FinalAddButton.setOnClickListener{

        }
    }
}