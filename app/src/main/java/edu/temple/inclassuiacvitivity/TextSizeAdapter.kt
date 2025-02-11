package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class TextSizeAdapter : BaseAdapter() {

    override fun getCount() = numbers.size
    }

    override fun getItem(position: Int) = numbers[position]
    }

    override fun getItemId(position: Int) = position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView - TextView(c)
        textView.text = numbers[position].toString()
        return textView
    }
    override fun getDropDownView(position: Int, convertView: View? parent: ViewGroup?): View {
        val textView = (getView(position, convertView, parent) as TextView)
        textView.textSize = numbers[position]
        return textView
    }
}