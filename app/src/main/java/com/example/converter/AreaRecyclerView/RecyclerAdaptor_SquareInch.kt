package com.example.converter.AreaRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.R
import com.example.converter.SquareInch.*

class RecyclerAdaptor_SquareInch: RecyclerView.Adapter<RecyclerAdaptor_SquareInch.ViewHolder>()  {
    private val list= arrayListOf(
        "SquareInch To SquareMeter",
        "SquareInch To SquareYard",
        "SquareInch To SquareFoot",
        "SquareInch To Hectare",
        "SquareInch To Acre"
    )

    inner class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        private val textView=itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text:String){
            textView.text=text
            textView.setOnClickListener {
                when(text){
                    list[0]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareInchToSquareMeter::class.java), null)
                    }
                    list[1]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareInchToSquareYard::class.java), null)
                    }
                    list[2]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareInchToSquareFoot::class.java), null)
                    }
                    list[3]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareInchToHectare::class.java), null)
                    }
                    list[4]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareInchToAcre::class.java), null)
                    }
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdaptor_SquareInch.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerAdaptor_SquareInch.ViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}