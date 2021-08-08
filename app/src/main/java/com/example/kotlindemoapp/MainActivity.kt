package com.example.kotlindemoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val action_online_class = findViewById<TextView>(R.id.action_online_class)

        action_online_class.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,BranchActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}