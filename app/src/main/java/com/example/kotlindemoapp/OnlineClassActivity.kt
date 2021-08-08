package com.example.kotlindemoapp

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class OnlineClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_class)

        val list_items = findViewById<ListView>(R.id.list_items)

        val classes = arrayOf("ANDROID DEV", "OR", "ENGLISH", "DM", "DE", "BE")
        val timings = arrayOf("9:00 - 10:00","10:00 - 11:00", "11:00 - 12:00", "1:00 - 2:00","2:00 - 3:00","3:00 - 4:00")


    }
}