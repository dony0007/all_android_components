package com.example.loginpagekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class SimpleAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_adapter)

        val list_simple = findViewById<ListView>(R.id.simpleListView)

        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf("Midhun","Dony","Civiya","Athulya","sayyd Anwer","Nazim","Joyatt")
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,users)


        list_simple.adapter = arrayAdapter
        list_simple.setOnItemLongClickListener{
            parentView, view ,position,id ->
            Toast.makeText(this,users[position].toString(),Toast.LENGTH_LONG).show()
            return@setOnItemLongClickListener true
        }
    } 
}

