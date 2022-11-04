package com.example.converter.MassRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.Ounce.*
import com.example.converter.R

class RecyclerAdapter_Ounce : RecyclerView.Adapter<RecyclerAdapter_Ounce.ViewHolder>() {
    private var list = arrayListOf(
        "Ounce To Kg",
        "Ounce To Tonne",
        "Ounce To US Ton",
        "Ounce To Gram",
        "Ounce To Stone",
        "Ounce To Pound",
        "Ounce To Milligram",
        "Ounce To Imperial Ton"
    )

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val textView = itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text: String) {
            textView.text = text
            textView.setOnClickListener {
                when (text) {
                    list[0] -> {
                        startActivity(it.context, Intent(it.context, Ounce_To_Kg::class.java), null)
                    }
                    list[1] -> {
                        startActivity(it.context, Intent(it.context, Ounce_To_Tonne::class.java), null)
                    }
                    list[2]->{
                        startActivity(it.context,Intent(it.context, Ounce_To_US_Ton::class.java), null)
                    }
                    list[3]->{
                        startActivity(it.context, Intent(it.context, Ounce_To_Gram::class.java),null)
                    }
                    list[4]->{
                        startActivity(it.context, Intent(it.context, Ounce_To_Stone::class.java),null)
                    }
                    list[5]->{
                        startActivity(it.context, Intent(it.context, Ounce_To_Pound::class.java),null)
                    }
                    list[6]->{
                        startActivity(it.context, Intent(it.context, OunceToMilligram::class.java),null)
                    }
                    list[7]->{
                        startActivity(it.context, Intent(it.context, OunceToImperialTon::class.java),null)
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