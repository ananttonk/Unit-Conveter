package com.example.converter.EnergyRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.Foot_Pound.*
import com.example.converter.R

class RecyclerAdapptor_Foot_pound():RecyclerView.Adapter<RecyclerAdapptor_Foot_pound.ViewHolder>() {
    private val list= arrayListOf(
        "Foot-Pound To Joule",
        "Foot-Pound To KiloJoule",
        "Foot-Pound To GramCalorie",
        "Foot-Pound To Kilocalorie",
        "Foot-Pound To WattHour",
        "Foot-Pound To British Thermal Unit"
    )

    inner class ViewHolder(v:View):RecyclerView.ViewHolder(v){
        private val textView=itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text:String){
            textView.text=text
            textView.setOnClickListener {
                when(text){
                    list[0]->{
                        startActivity(it.context, Intent(it.context,Foot_pound_To_Joule::class.java),null)
                    }
                    list[1]->{
                        startActivity(it.context, Intent(it.context,Foot_pound_To_KiloJoule::class.java),null)
                    }
                    list[2]->{
                        startActivity(it.context, Intent(it.context,Foot_pound_To_GramCalorie::class.java),null)
                    }
                    list[3]->{
                        startActivity(it.context, Intent(it.context,Foot_pound_To_KiloCalorie::class.java),null)
                    }
                    list[4]->{
                        startActivity(it.context, Intent(it.context,Foot_pound_To_WAttHour::class.java),null)
                    }
                    list[5]->{
                        startActivity(it.context, Intent(it.context,Foot_pound_To_BritishThermalUnit::class.java),null)
                    }
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapptor_Foot_pound.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerAdapptor_Foot_pound.ViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}