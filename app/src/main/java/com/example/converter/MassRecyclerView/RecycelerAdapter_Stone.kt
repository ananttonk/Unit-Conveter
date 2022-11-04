package com.example.converter.MassRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.R
import com.example.converter.Stone.*

class RecycelerAdapter_Stone() : RecyclerView.Adapter<RecycelerAdapter_Stone.ViewHolder>(
) {
    private val list = arrayListOf(
        "Stone To Gram",
        "Stone To Imperial Ton",
        "Stone To Kg",
        "Stone to Milligram",
        "Stone To Ounce",
        "Stone To Pound",
        "Stone To Tonne",
        "Stone To Us Ton"
    )
    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val textView = itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text: String) {
            textView.text = text
            textView.setOnClickListener {
                when (text) {
                    list[0] -> {
                        startActivity(it.context, Intent(it.context, StoneToGram::class.java),null)
                    }
                    list[1] -> {
                        startActivity(it.context, Intent(it.context, StoneToImperialTon::class.java),null)
                    }
                    list[2] -> {
                        startActivity(it.context, Intent(it.context, StoneToKg::class.java),null)
                    }
                    list[3] -> {
                        startActivity(it.context, Intent(it.context, StoneToMilligram::class.java),null)
                    }
                    list[4]->{
                        startActivity(it.context, Intent(it.context,StoneToOunce::class.java),null)
                    }
                    list[5]->{
                        startActivity(it.context, Intent(it.context,StoneToPound::class.java),null)
                    }
                    list[6]->{
                        startActivity(it.context, Intent(it.context,StoneToTonne::class.java),null)
                    }
                    list[7]->{
                        startActivity(it.context, Intent(it.context,StoneToUsTon::class.java),null)
                    } } } } }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view, parent, false))
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(list[position])
    }
    override fun getItemCount(): Int {
        return list.size
    } }