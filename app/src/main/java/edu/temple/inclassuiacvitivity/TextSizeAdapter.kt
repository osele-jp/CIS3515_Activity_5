package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, numberArray: Array<Int>) : BaseAdapter() {

    private val numArray = numberArray
    private val context = _context

    override fun getCount(): Int {
        return numArray.size
    }

    override fun getItem(position: Int): Any {
        return numArray[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView

        if (convertView == null)
            textView = TextView(context)
        else
            textView = (convertView as TextView)

        textView.text = numArray[position].toString()

        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val textView = (getView(position, convertView, parent) as TextView )
        textView.textSize = numArray[position].toFloat()
        return textView
    }

}

