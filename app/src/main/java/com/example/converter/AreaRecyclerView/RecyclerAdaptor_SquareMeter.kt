package com.example.converter.AreaRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.R
import com.example.converter.SquareMeter.*

class RecyclerAdaptor_SquareMeter(): RecyclerView.Adapter<RecyclerAdaptor_SquareMeter.ViewHolder>()  {
    private val list= arrayListOf(
        "SquareMeter To SquareYard",
        "SquareMeter To SquareFoot",
        "SquareMeter To SquareInch",
        "SquareMeter To Hectare",
        "SquareMeter To Acre"
    )

    inner class ViewHolder(v: View):RecyclerView.ViewHolder(v){
        private val textView=itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text:String){
            textView.text=text
            textView.setOnClickListener {
                when(text){
                    list[0]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareMeter_To_SquareYard::class.java), null)
                    }
                    list[1]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareMeter_To_SquareFoot::class.java), null)
                    }
                    list[2]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareMeter_To_SquareInch::class.java), null)
                    }
                    list[3]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareMeter_To_Hectare::class.java), null)
                    }
                    list[4]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareMeter_To_Acre::class.java), null)
                    }
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdaptor_SquareMeter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerAdaptor_SquareMeter.ViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}