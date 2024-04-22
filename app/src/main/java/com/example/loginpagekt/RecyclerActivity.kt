package com.example.loginpagekt

import SampleData
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loginpagekt.Adaptor.RecyclerAdapter

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val recycler = findViewById<RecyclerView>(R.id.recycler_layout)

        recycler.layoutManager = LinearLayoutManager(this)

        val data = SampleData.conversationSample

        val adapter = RecyclerAdapter(data)

        recycler.adapter = adapter
    }
}