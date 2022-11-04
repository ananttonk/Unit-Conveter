package com.example.converter.joule

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.R
import com.example.converter.databinding.ListBinding
import com.example.converter.EnergyRecyclerView.RecyclerAdaptor_Joule

class Joule_List_Page:AppCompatActivity() {
    private lateinit var binding: ListBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val list=findViewById<RecyclerView>(R.id.recyclerview)
        list.adapter=RecyclerAdaptor_Joule()
        binding.toolBarName.text="Joule Converter"
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
    }
}