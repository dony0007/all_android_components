package com.example.loginpagekt

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class StyleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_style)

        val imageView = findViewById<ImageView>(R.id.imageView)

        try {
            var inputStream = assets.open("dhoni.jpg")
            val bitMapImg = BitmapFactory.decodeStream(inputStream)
            imageView.setImageBitmap(bitMapImg)
        }catch (e: Exception){
            e.printStackTrace()
        }



        var resource = findViewById<Button>(R.id.bt_resource)

        resource.setOnClickListener(View.OnClickListener {
            var i = Intent(applicationContext,ResourceActivity::class.java)
            startActivity(i)
        })
    }
}


