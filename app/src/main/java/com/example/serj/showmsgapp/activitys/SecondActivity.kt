package com.example.serj.showmsgapp.activitys

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.serj.showmsgapp.R
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("use msg")
        txtUserMsg.text =msg
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}