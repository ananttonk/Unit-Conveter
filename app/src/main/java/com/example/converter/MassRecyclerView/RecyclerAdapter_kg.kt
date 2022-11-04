package com.example.converter.MassRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.Kg.*
import com.example.converter.R


class RecyclerAdapter_kg : RecyclerView.Adapter<RecyclerAdapter_kg.ViewHolder>() {
    private val list = arrayListOf(
        "Kg To Pound",
        "Kg To Tonne",
        "Kg To US Ton",
        "Kg To Gram",
        "Kg To Stone",
        "Kg To Ounce",
        "Kg To Milligram",
        "Kg To Imperial Ton"
    )

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val textView = itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text: String) {
            textView.text = text
            textView.setOnClickListener {
                when (text) {
                    list[0] -> {
                        startActivity(it.context, Intent(it.context, Kg_To_Pound::class.java), null)
                    }
                    list[1] -> {
                        startActivity(it.context, Intent(it.context, Kg_To_Tonne::class.java), null)
                    }
                    list[2]->{
                        startActivity(it.context, Intent(it.context, KG_To_US_Ton::class.java),null)
                    }
                    list[3] -> {
                        startActivity(it.context, Intent(it.context, Kg_To_Gram::class.java), null)
                    }
                    list[4] -> {
                        startActivity(it.context, Intent(it.context, Kg_To_Stone::class.java), null)
                    }
                    list[5] -> {
                        startActivity(it.context, Intent(it.context, Kg_To_Ounce::class.java), null)
                    }
                    list[6]->{
                        startActivity(it.context, Intent(it.context, KgToMilligram::class.java),null)
                    }
                    list[7]->{
                        startActivity(it.context, Intent(it.context, KgToImperialTon::class.java),null)
                    }
                }
            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(list[position])

    }

    override fun getItemCount(): Int {
        return list.size
    }

}