package com.example.kotlindemoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BranchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_branch)
        val action_cse = findViewById<TextView>(R.id.action_cse)

        action_cse.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,OnlineClassActivity::class.java)
        })
    }
}