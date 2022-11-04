package com.example.converter.Foot_Pound

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.R
import com.example.converter.databinding.ListBinding
import com.example.converter.EnergyRecyclerView.RecyclerAdapptor_Foot_pound

class Foot_Pound_List:AppCompatActivity() {
    private lateinit var binding:ListBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val list=findViewById<RecyclerView>(R.id.recyclerview)
        list.adapter=RecyclerAdapptor_Foot_pound()
        binding.toolBarName.text="Foot-Pound Converter"
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
    }
}