package com.example.serj.showmsgapp.activitys

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.serj.showmsgapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//--------------------------------------------------------------------------------
        BtnShowMsg.setOnClickListener {
         Toast.makeText(this,"this is  a mesage ",Toast.LENGTH_SHORT).show()
//            Log.i("Main activity ","Button was access")
        }
//--------------------------------------------------------------------------------

        bntSendMsg.setOnClickListener {
            val massage:String =  etUserMsg.text.toString()
//             Toast.makeText(this,massage,Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("use msg", massage)
            startActivity(intent)
        }
//--------------------------------------------------------------------------------
        bntShareApp.setOnClickListener {
            val message:String =  etUserMsg.text.toString()
            val intent =  Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"Please select application :"))
        }
//--------------------------------------------------------------------------------
        bntRecicleView.setOnClickListener {

            val intent = Intent(this, HobbiesActivity::class.java)

            startActivity(intent)

        }
    }
}

