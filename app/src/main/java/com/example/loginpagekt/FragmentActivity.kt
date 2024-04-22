package com.example.loginpagekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        var radioChecked: String?= null




        var bt_staticFrag = findViewById<Button>(R.id.bt_static)

        bt_staticFrag.setOnClickListener{
            var i = Intent(applicationContext,StaticFrag::class.java)
            startActivity(i)
        }



        var bt_DynamicFrag = findViewById<Button>(R.id.bt_dynamic)

        var radioGroup = findViewById<RadioGroup>(R.id.radiogroup)




        bt_DynamicFrag.setOnClickListener {
            var i = Intent(applicationContext, Dynamicfrag::class.java)
            if (radioChecked != null) {
                val bundle: Bundle = Bundle()
                bundle.putString("order", radioChecked)
                i.putExtra("bundle", bundle)
            }
            startActivity(i)
        }






        bt_DynamicFrag.setOnClickListener {
            var i = Intent(applicationContext, Dynamicfrag::class.java)
            if (radioChecked != null) {
                val bundle: Bundle = Bundle()
                bundle.putString("order", radioChecked)
                i.putExtra("bundle", bundle)
            }
            startActivity(i)
        }

//        radioGroup.setOnCheckedChangeListener { group, checkId ->
//            val radiobtn = findViewById<RadioGroup>(checkId)
//            Toast.makeText(applicationContext,radiobtn.text.toString(),Toast.LENGTH_LONG).show()
//
//            if (radiobtn.text.equals("Fragment One"))
//                radioChecked = "one"
//            else if (radiobtn.text.equals("Fragment Two"))
//                radioChecked = "two"
//            else
//                radioChecked = null
//
//        }


        var bt_listview = findViewById<Button>(R.id.bt_list_view)

        bt_listview.setOnClickListener {
            var i = Intent(applicationContext,Adapters::class.java)
            startActivity(i)
        }




    }
}

