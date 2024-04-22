package com.example.loginpagekt

import android.app.Activity
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast


fun Toast.showCustomToast(message: String,activity: Activity) {
    val layout = activity.layoutInflater
        .inflate(R.layout.custom_layout,activity.findViewById(R.id.custom_toast_container))


    var textView = layout.findViewById<TextView>(R.id.tv_toastmsg)
    textView.text = message

    this.apply {
        setGravity(Gravity.BOTTOM,0,200)
        view=layout
        show()
    }
}