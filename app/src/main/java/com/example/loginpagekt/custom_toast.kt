package com.example.loginpagekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class custom_toast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast)

        var bt_toast = findViewById<Button>(R.id.bt_toast)
        var bt_cToast = findViewById<Button>(R.id.bt_custom_toast)
        var bt_dialog = findViewById<Button>(R.id.bt_dialog)
        var bt_cDialog = findViewById<Button>(R.id.bt_customdialog)



        bt_toast.setOnClickListener {
            Toast.makeText(applicationContext,"Normal Toast ", Toast.LENGTH_LONG).show()
        }

        bt_cToast.setOnClickListener {
            Toast(this).showCustomToast("customtoast",this)
        }

        bt_dialog.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setTitle("Dialog Title")
                .setMessage("Dialog message")
                .setIcon(R.drawable.baseline_exit_to_app_24)
                .setPositiveButton("OK") {
                    dialogBuilder,which ->
                    Toast.makeText(applicationContext,"Normal DIOLOG",Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Cancel"){
                    dialogBuilder,which -> dialogBuilder.cancel()
                }.show()
        }

        bt_cDialog.setOnClickListener {
            val builder = AlertDialog.Builder(this).create()
            val layout = layoutInflater.inflate(R.layout.custom_dialog,null)
            val uname = layout.findViewById<EditText>(R.id.et_uname_cd)
            val okButton = layout.findViewById<Button>(R.id.bt_goback)
            val cancelButton = layout.findViewById<Button>(R.id.button)
            builder.setView(layout)
            okButton.setOnClickListener {
                Toast.makeText(applicationContext,uname.text.toString(),Toast.LENGTH_LONG).show()
            }
            cancelButton.setOnClickListener {
                builder.dismiss()
            }
            builder.setCanceledOnTouchOutside(false)
            builder.show()

        }

    }
}

private fun Toast.showCustomToast(s: String, customToast: custom_toast) {

}
