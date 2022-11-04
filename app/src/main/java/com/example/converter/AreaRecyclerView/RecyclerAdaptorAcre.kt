package com.example.converter.AreaRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.Acre.*
import com.example.converter.R

class RecyclerAdaptorAcre (): RecyclerView.Adapter<RecyclerAdaptorAcre.ViewHolder>()  {
    private val list= arrayListOf(
        "Acre To SquareMeter",
        "Acre To SquareYard",
        "Acre To SquareInch",
        "Acre To SquareFoot",
        "Acre To Hectare"
    )

    inner class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        private val textView=itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text:String){
            textView.text=text
            textView.setOnClickListener {
                when(text){
                    list[0]->{
                        startActivity(it.context,
                            Intent(it.context, AcreToSquareMeter::class.java), null)
                    }
                    list[1]->{
                        startActivity(it.context,
                            Intent(it.context, AcreToSquareYard::class.java), null)
                    }
                    list[2]->{
                        startActivity(it.context,
                            Intent(it.context, AcreToSquareInch::class.java), null)
                    }
                    list[3]->{
                        startActivity(it.context,
                            Intent(it.context, AcreToSquareFoot::class.java), null)
                    }
                    list[4]->{
                        startActivity(it.context,
                            Intent(it.context, AcreToHectare::class.java), null)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdaptorAcre.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerAdaptorAcre.ViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}