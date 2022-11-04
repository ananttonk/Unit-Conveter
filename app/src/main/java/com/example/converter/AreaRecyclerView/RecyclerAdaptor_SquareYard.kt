package com.example.converter.AreaRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.R
import com.example.converter.SquareYard.*

class RecyclerAdaptor_SquareYard (): RecyclerView.Adapter<RecyclerAdaptor_SquareYard.ViewHolder>()  {
    private val list= arrayListOf(
        "SquareYard To SquareMeter",
        "SquareYard To SquareFoot",
        "SquareYard To SquareInch",
        "SquareYard To Hectare",
        "SquareYard To Acre"
    )

    inner class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        private val textView=itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text:String){
            textView.text=text
            textView.setOnClickListener {
                when(text){
                    list[0]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareYardToSquareMeter::class.java), null)
                    }
                    list[1]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareYardToSquareFoot::class.java), null)
                    }
                    list[2]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareYArdToSquareInch::class.java), null)
                    }
                    list[3]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareYardToHectare::class.java), null)
                    }
                    list[4]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareYardToAcre::class.java), null)
                    }
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdaptor_SquareYard.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerAdaptor_SquareYard.ViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}