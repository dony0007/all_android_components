package com.example.loginpagekt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class progressbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progressbar)

        var gototoasts = findViewById<Button>(R.id.bt_gototoasttypes)
        var styles = findViewById<Button>(R.id.bt_styles)

        styles.setOnClickListener(View.OnClickListener {
            var i = Intent(applicationContext,StyleActivity::class.java)
            startActivity(i)
        })

        gototoasts.setOnClickListener(View.OnClickListener{
            var i = Intent(applicationContext,custom_toast::class.java)
            startActivity(i)
        })

        var tv_horizontal = findViewById<TextView>(R.id.tv_horizontal)
        var btStart = findViewById<Button>(R.id.bt_start)
        var hProgess = findViewById<ProgressBar>(R.id.horizontalprogressBar3)
        var btnHorizontal = findViewById<Button>(R.id.bt_horizontal)

        var cProgress = findViewById<ProgressBar>(R.id.circularProgressBar)
        cProgress.visibility = View.INVISIBLE
        var btnCircular = findViewById<Button>(R.id.bt_circular)

        tv_horizontal!!.text = "0/" + hProgess.max
        var i = 0

        btnHorizontal.setOnClickListener{
            i+=10
            if (i>=100){
                i = 0
            }

            hProgess.progress=i
            tv_horizontal!!.text = i.toString() + "/" + hProgess.max
        }

        btStart.setOnClickListener {
            hProgess.visibility=View.VISIBLE
            i = hProgess.progress

            Thread(Runnable {
                if (i>=100) {
                    i=0
                }
                while (i<100){
                    i += 10

                    runOnUiThread(Runnable {
                        hProgess.progress = i
                        tv_horizontal!!.text = i.toString() + "/" + hProgess.max
                    })

                    try {
                        Thread.sleep(500)
                    }catch (e:InterruptedException){
                        e.printStackTrace()
                    }
                }
            }).start()
        }

        btnCircular.setOnClickListener {
            cProgress.visibility = View.VISIBLE
            i = hProgess.progress

            Thread(Runnable {
                if (i>100){
                    i = 0
                }
                while (i<100){
                    i += 1

                    runOnUiThread(Runnable {
                        hProgess.progress = i
                        tv_horizontal!!.text =  i.toString() + "/" + hProgess.max

                    })

                    try {
                        Thread.sleep(200)
                    }catch (e:InterruptedException){
                        e.printStackTrace()
                    }
                }
                cProgress.visibility = View.INVISIBLE
            }).start()


        }

    }
}