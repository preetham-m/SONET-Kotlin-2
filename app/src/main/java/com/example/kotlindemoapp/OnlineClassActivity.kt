package com.example.kotlindemoapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class OnlineClassActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_class)

        val list_items = findViewById<ListView>(R.id.list_items)
        //val classes = arrayOf("ANDROID DEV", "OR", "ENGLISH", "DM", "DE", "BE")
        //val timings = arrayOf("9:00 - 10:00","10:00 - 11:00", "11:00 - 12:00", "1:00 - 2:00","2:00 - 3:00","3:00 - 4:00")

        val list = mutableListOf<DataSet>()
        list.add(DataSet("ANDROID DEV", "9:00 - 10:00", 0))
        list.add(DataSet("OR","10:00 - 11:00",1))
        list.add(DataSet("ENGLISH","11:00 - 12:00",2))
        list.add(DataSet("DM","1:00 - 2:00",3))
        list.add(DataSet("DE","2:00 - 3:00",4))
        list.add(DataSet("BE","3:00 - 4:00",5))

        list_items.adapter = MyAdapter(this,R.layout.list_element, list)

        var buttonid: Button = findViewById(R.id.clikable)
        buttonid.setOnClickListener(View.OnClickListener {
            if (buttonid.tag == 0) {
                var link = Uri.parse("https://meet.google.com")
                val intent = Intent(Intent.ACTION_VIEW, link)
                startActivity(intent)
            }
            if (buttonid.tag == 1) {
                var link = Uri.parse("https://meet.google.com")
                val intent = Intent(Intent.ACTION_VIEW, link)
                startActivity(intent)
            }
            if (buttonid.tag == 2) {
                var link = Uri.parse("https://meet.google.com")
                val intent = Intent(Intent.ACTION_VIEW, link)
                startActivity(intent)
            }
            if (buttonid.tag == 3) {
                var link = Uri.parse("https://meet.google.com")
                val intent = Intent(Intent.ACTION_VIEW, link)
                startActivity(intent)
            }
            if (buttonid.tag == 4) {
                var link = Uri.parse("https://meet.google.com")
                val intent = Intent(Intent.ACTION_VIEW, link)
                startActivity(intent)
            }
            if (buttonid.tag == 5) {
                var link = Uri.parse("https://meet.google.com")
                val intent = Intent(Intent.ACTION_VIEW, link)
                startActivity(intent)
            }
        })
    }
}