package com.example.converter.AreaRecyclerView

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.R
import com.example.converter.SquareFoot.*
class RecyclerAdaptor_SquareFoot(): RecyclerView.Adapter<RecyclerAdaptor_SquareFoot.ViewHolder>()  {
    private val list= arrayListOf(
        "SquareFoot To SquareMeter",
        "SquareFoot To SquareYard",
        "SquareFoot To SquareInch",
        "SquareFoot To Hectare",
        "SquareFoot To Acre"
    )

    inner class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        private val textView=itemView.findViewById<TextView>(R.id.List_View)
        fun setData(text:String){
            textView.text=text
            textView.setOnClickListener {
                when(text){
                    list[0]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareFootToSquareMeter::class.java), null)
                    }
                    list[1]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareFootToSquareYard::class.java), null)
                    }
                    list[2]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareFootToSquareInch::class.java), null)
                    }
                    list[3]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareFootToHectare::class.java), null)
                    }
                    list[4]->{
                        ContextCompat.startActivity(it.context,
                            Intent(it.context, SquareFootToAcre::class.java), null)
                    }
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdaptor_SquareFoot.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerAdaptor_SquareFoot.ViewHolder, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}