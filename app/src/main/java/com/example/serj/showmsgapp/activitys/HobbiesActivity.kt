package com.example.serj.showmsgapp.activitys

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.serj.showmsgapp.R
import com.example.serj.showmsgapp.adapters.HobiesAdapter
import com.example.serj.showmsgapp.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        SetRecycleView()

    }

//-------------------------------------------------------------------
    private fun SetRecycleView(){

        val layoutMAnager = LinearLayoutManager(this)
        layoutMAnager.orientation =LinearLayoutManager.VERTICAL
        recivleView.layoutManager = layoutMAnager

        val adapter = HobiesAdapter(this, Supplier.hobbies)
        recivleView.adapter= adapter

    }
}
