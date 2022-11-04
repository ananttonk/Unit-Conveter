package com.example.converter.EnergyRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.Gramcalorie.*
import com.example.converter.R

class RecyclerAdaptor_Gramcalorie() : RecyclerView.Adapter<RecyclerAdaptor_Gramcalorie.ViewHolder>() {
    private var list= arrayListOf(
        "GramCalorie To Joule",
        "GramCalorie To KiloJoule",
        "GramCalorie To Kilocalorie",
        "GramCalorie To WattHour",
        "GramCalorie To British Thermal Unit",
        "GramCalorie To Foot-Pound"
    )

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val textView=itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text:String){
            textView.text=text
            textView.setOnClickListener {
                when(text){
                    list[0]->{startActivity(it.context,
                        Intent(it.context,GramCalorie_To_Joule::class.java),null)}
                    list[1]->{startActivity(it.context,
                        Intent(it.context, GramCalorie_To_KiloJoule::class.java),null)}
                    list[2]->{startActivity(it.context,
                        Intent(it.context,GramCalorie_To_KiloCalorie::class.java),null)}
                    list[3]->{startActivity(it.context,
                        Intent(it.context,GramCalorie_To_Watt_Hour::class.java),null)}
                    list[4]->{startActivity(it.context,
                        Intent(it.context,
                            GramCalorie_To_British_Thermal_Uint::class.java),null)}
                    list[5]->{startActivity(it.context,
                        Intent(it.context,GramCalorie_To_Foot_Pound::class.java),null)}
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): RecyclerAdaptor_Gramcalorie.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerAdaptor_Gramcalorie.ViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}