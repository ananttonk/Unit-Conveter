package com.example.converter.AreaRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.Hectare.*
import com.example.converter.R

class RecyclerAdaptor_Hectare (): RecyclerView.Adapter<RecyclerAdaptor_Hectare.ViewHolder>()  {
    private val list= arrayListOf(
        "Hectare To SquareMeter",
        "Hectare To SquareYard",
        "Hectare To SquareInch",
        "Hectare To SquareFoot",
        "Hectare To Acre"
    )

    inner class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        private val textView=itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text:String){
            textView.text=text
            textView.setOnClickListener {
                when(text){
                    list[0]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, HectareToSquareMeter::class.java), null)
                    }
                    list[1]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, HectareToSquareYard::class.java), null)
                    }
                    list[2]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, HectareToSquareInch::class.java), null)
                    }
                    list[3]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, HectareToSquareFoot::class.java), null)
                    }
                    list[4]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, HectareToAcre::class.java), null)
                    }
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdaptor_Hectare.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerAdaptor_Hectare.ViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}