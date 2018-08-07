package com.example.serj.showmsgapp.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.serj.showmsgapp.R
import com.example.serj.showmsgapp.models.Hobby
import kotlinx.android.synthetic.main.list_item.view.*


class HobiesAdapter(val context:Context, private val hobbies:List<Hobby>): RecyclerView.Adapter<HobiesAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby= hobbies[position]
        holder.setData(hobby,position)
    }

    inner  class MyViewHolder( itemView:View) : RecyclerView.ViewHolder(itemView){
     var currentHobies: Hobby?=null
     var currentPosition: Int = 0

        init{
            itemView.setOnClickListener {
                Toast.makeText(context,currentHobies!!.title + "Cliked !",Toast.LENGTH_SHORT).show()
            }

            itemView.imgShare.setOnClickListener {
                val message:String =  "Myhobies is " + currentHobies!!.title
                val intent =  Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type = "text/plain"
                context.startActivity(Intent.createChooser(intent,"Please select application :"))
            }
        }
     fun setData(hobby: Hobby?, position: Int){
         itemView.txvTitle.text =  hobby!!.title

         this.currentHobies = hobby
         this.currentPosition = position
     }
    }
}