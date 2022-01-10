package com.example.sensingcrowd

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.respond_task.*

class RespondTask : AppCompatActivity() , CellClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.respond_task)

        // getting the recyclerview by its id
        // val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<TaskModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        data.add(TaskModel(R.drawable.ic_noise, "Task 1"))
        data.add(TaskModel(R.drawable.ic_noise, "Task 1"))

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data, this)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
    override fun onCellClickListener() {
        val intent = Intent(this, NoiseActivity::class.java)
        startActivity(intent)    }
}
interface CellClickListener {
    fun onCellClickListener()
}