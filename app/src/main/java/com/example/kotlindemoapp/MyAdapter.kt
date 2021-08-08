package com.example.kotlindemoapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView

class MyAdapter (var mcon:Context, var resources: Int, var items: List<DataSet>):ArrayAdapter<DataSet>(mcon, resources,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val LayoutInflater:LayoutInflater = LayoutInflater.from(mcon)
        val view:View = LayoutInflater.inflate(resources,null)

        val classtext: TextView = view.findViewById(R.id.class_name)
        val class_time: TextView = view.findViewById(R.id.time_slots)
        val button_id: Button = view.findViewById(R.id.clikable)

        var mitems: DataSet = items[position]
        classtext.text = mitems.classes
        class_time.text = mitems.timings
        button_id.tag = mitems.button
        return view
    }
}