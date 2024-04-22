package com.example.loginpagekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Dynamicfrag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamicfrag)



        var fragone = findViewById<Button>(R.id.bt_fragone)


        var fragtwo = findViewById<Button>(R.id.bt_fragtwo)

        var fragmentManager = supportFragmentManager



        fragone.setOnClickListener(View.OnClickListener {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, FragmentOne())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        })

        fragtwo.setOnClickListener(View.OnClickListener {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container, FragmentTwo())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

        })
    }
}