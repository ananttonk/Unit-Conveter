package com.example.converter.EnergyRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.KiloCalorie.*
import com.example.converter.R

class RecyclerAdaptor_KiloCalorie() :
    RecyclerView.Adapter<RecyclerAdaptor_KiloCalorie.ViewHolder>() {
    private val list = arrayListOf(
        "Kilocalorie To Joule",
        "Kilocalorie To KiloJoule",
        "Kilocalorie To GramCalorie",
        "Kilocalorie To WattHour",
        "Kilocalorie To British Thermal Unit",
        "Kilocalorie To Foot-Pound"
    )

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val textView = itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text: String) {
            textView.text = text
            textView.setOnClickListener {
                when (text) {
                    list[0] -> {
                        startActivity(it.context, Intent(it.context,KiloCalorie_To_Joule::class.java),null)
                    }
                    list[1] -> {
                        startActivity(it.context, Intent(it.context,KiloCalorie_To_KiloJoule::class.java),null)
                    }
                    list[2] -> {
                        startActivity(it.context, Intent(it.context,KiloCalorie_To_GramCalorie::class.java),null)
                    }
                    list[3] -> {
                        startActivity(it.context, Intent(it.context,KiloCalorie_To_WattHour::class.java),null)
                    }
                    list[4] -> {
                        startActivity(it.context, Intent(it.context,KiloCalorie_To_British_Thermal_Unit::class.java),null)
                    }
                    list[5] -> {
                        startActivity(it.context, Intent(it.context,KiloCalorie_To_Foot_Pound::class.java),null)
                    }
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}