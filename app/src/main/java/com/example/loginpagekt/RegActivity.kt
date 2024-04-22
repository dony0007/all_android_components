package com.example.loginpagekt

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)


        var name = findViewById<EditText>(R.id.editText_name)
        var button = findViewById<Button>(R.id.bt_1)
        var dob = findViewById<EditText>(R.id.dob)

        var fragment = findViewById<Button>(R.id.bt_frag)

        var notification = findViewById<Button>(R.id.bt_noti)

        notification.setOnClickListener(View.OnClickListener {
            var i = Intent(applicationContext,NotificationActivity::class.java)
            startActivity(i)
        })

        fragment.setOnClickListener(View.OnClickListener {
            var i = Intent(applicationContext,FragmentActivity::class.java)
            startActivity(i)
        })



        button.setOnClickListener(View.OnClickListener{
            var i = Intent(applicationContext,progressbar::class.java)
            startActivity(i)
        })







        registerForContextMenu(name)

        dob.setOnClickListener(View.OnClickListener {
            val cal  = Calendar.getInstance()


            val day = cal.get(Calendar.DAY_OF_MONTH )
            val month = cal.get(Calendar.MONTH)
            val year = cal.get(Calendar.YEAR)


            val datePickerDialog = DatePickerDialog(this,{
                view,year,monthOfYear,dayOfMonth -> dob.setText((dayOfMonth).toString()+"-"+(monthOfYear+1)+"-"+year)},
                year,month,day)
            datePickerDialog.show()
            })
        }



    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.context, menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.context_cut -> {
                Toast.makeText(applicationContext, "CUT", Toast.LENGTH_LONG).show()
            }

            R.id.context_copy -> {
                Toast.makeText(applicationContext, "COPY", Toast.LENGTH_LONG).show()
            }

            R.id.context_paste -> {
                Toast.makeText(applicationContext, "PASTE", Toast.LENGTH_LONG).show()
            }
        }
        return super.onContextItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option_logout -> {
                Toast.makeText(applicationContext, "successfully loged out", Toast.LENGTH_LONG).show()
            }
            R.id.op_settings -> {
                Toast.makeText(applicationContext, "go to settings", Toast.LENGTH_LONG).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}


