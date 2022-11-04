package com.example.converter.MassRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.Gram.*
import com.example.converter.R

class RecyclerAdapter_Gram : RecyclerView.Adapter<RecyclerAdapter_Gram.ViewHolder>() {
    private val list = arrayListOf(
        "Gram To Kg",
        "Gram To Pound",
        "Gram To Milligram",
        "Gram To Stone",
        "Gram To Ounce",
        "Gram To Tonne"
    )

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val textView = itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text: String) {
            textView.text = text
            textView.setOnClickListener {
                when (text) {
                    list[0] -> {
                        startActivity(it.context, Intent(it.context, Gram_To_Kg::class.java), null)
                    }
                    list[1] -> {
                        startActivity(
                            it.context,
                            Intent(it.context, Gram_To_Pound::class.java),
                            null
                        )
                    }
                    list[2] -> {
                        startActivity(
                            it.context,
                            Intent(it.context, Gram_To_Milligram::class.java),
                            null
                        )
                    }
                    list[3] -> {
                        startActivity(
                            it.context,
                            Intent(it.context, Gram_To_Stone::class.java),
                            null
                        )
                    }
                    list[4] -> {
                        startActivity(
                            it.context,
                            Intent(it.context, Gram_To_Ounce::class.java),
                            null
                        )
                    }
                    list[5] -> {
                        startActivity(it.context, Intent(it.context, GramToTonne::class.java), null)
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