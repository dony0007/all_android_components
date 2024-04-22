package com.example.loginpagekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Adapters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapters)

        var simpleAdapter = findViewById<Button>(R.id.bt_simple)


        simpleAdapter.setOnClickListener(View.OnClickListener {
            var i = Intent(applicationContext,SimpleAdapter::class.java)
            startActivity(i)
        })


        var recycle = findViewById<Button>(R.id.bt_recycler)

        recycle.setOnClickListener(View.OnClickListener {
            var i = Intent(applicationContext,RecyclerActivity::class.java)
            startActivity(i)

        })
    }
}