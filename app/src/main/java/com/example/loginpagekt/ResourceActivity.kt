package com.example.loginpagekt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ResourceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        var goback = findViewById<Button>(R.id.bt_goback)
        var change = findViewById<Button>(R.id.butto1)
        var img = findViewById<ImageView>(R.id.secondimageView)

        goback.setOnClickListener(View.OnClickListener {
            var i = Intent(applicationContext,StyleActivity::class.java)
            startActivity(i)
        })

        change.setOnClickListener {
            img.setImageResource(R.drawable.dhoni)
        }
    }
}