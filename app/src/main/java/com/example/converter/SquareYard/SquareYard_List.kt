package com.example.converter.SquareYard

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.converter.AreaRecyclerView.RecyclerAdaptor_SquareYard
import com.example.converter.R
import com.example.converter.databinding.ListBinding

class SquareYard_List: AppCompatActivity() {
    private lateinit var binding: ListBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val list=findViewById<RecyclerView>(R.id.recyclerview)
        list.adapter= RecyclerAdaptor_SquareYard()
        binding.toolBarName.text="SquareYard Converter"
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
    }
}