package com.example.loginpagekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.bt_signin)
        var uname = findViewById<EditText>(R.id.editText_name)

        registerForContextMenu(uname)

        btn.setOnLongClickListener(View.OnLongClickListener {
            showPopUpMenu(btn)
        })

        btn.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext,"Successfully Signed "+uname.text.toString(),Toast.LENGTH_LONG).show()
            var i = Intent(applicationContext,RegActivity::class.java)
            startActivity(i)
        })

    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.context,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.context_cut -> {
                Toast.makeText(applicationContext,"cutted",Toast.LENGTH_SHORT).show()
            }
            R.id.context_copy -> {
                Toast.makeText(applicationContext,"copied",Toast.LENGTH_LONG).show()
            }
            R.id.context_paste -> {
                Toast.makeText(applicationContext,"pasted",Toast.LENGTH_LONG).show()
            }
        }
        return super.onContextItemSelected(item)
    }

    fun showPopUpMenu(v: View?): Boolean {
        PopupMenu(this,v).apply {
            setOnMenuItemClickListener(this@MainActivity)
            inflate(R.menu.poup)
            show()
        }
        return true

    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.pop_png -> {
                Toast.makeText(applicationContext,"save as png",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.pop_JPEG -> {
                Toast.makeText(applicationContext,"save as jpng",Toast.LENGTH_LONG).show()
                return true
            }
        }
        return false
    }


}


