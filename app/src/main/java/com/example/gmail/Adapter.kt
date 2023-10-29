package com.example.gmail

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class Adapter (val context: Context, private val list_email : Array<email>): BaseAdapter() {

    class viewHolder(row: View){

    }
    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(p0: Int): Any {
        return list_email[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): Int {
      return list_email.size;
    }

}