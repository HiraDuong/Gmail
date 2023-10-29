package com.example.gmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailListView = findViewById<ListView>(R.id.list_view)

        val emailList = listOf("example1@gmail.com", "example2@gmail.com", "example3@gmail.com", "example3@gmail.com", "example3@gmail.com", "example3@gmail.com", "example3@gmail.com", "example3@gmail.com", "example3@gmail.com", "example3@gmail.com", "example3@gmail.com", "example3@gmail.com")


        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            emailList
        )

        // Gán Adapter cho ListView
        emailListView.adapter = adapter
    }
}