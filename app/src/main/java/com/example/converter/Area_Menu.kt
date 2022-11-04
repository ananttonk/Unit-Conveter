package com.example.converter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.Acre.Acre_list
import com.example.converter.Hectare.Hectare_List
import com.example.converter.SquareFoot.SquareFoot_list
import com.example.converter.SquareInch.SquareInch_List
import com.example.converter.SquareMeter.SquareMeter_List
import com.example.converter.SquareYard.SquareYard_List
import com.example.converter.databinding.AreaListBinding

class Area_Menu:AppCompatActivity() {
    private lateinit var binding:AreaListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= AreaListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }

        binding.SquareMeterConverter.setOnClickListener {
            val intent=Intent(this , SquareMeter_List::class.java)
            startActivity(intent)
        }
        binding.SquareYardConverter.setOnClickListener {
            val intent=Intent(this , SquareYard_List::class.java)
            startActivity(intent)
        }
        binding.SquareFootConverter.setOnClickListener {
            val intent=Intent(this , SquareFoot_list::class.java)
            startActivity(intent)
        }
        binding.SquareInchConverter.setOnClickListener {
            val intent=Intent(this , SquareInch_List::class.java)
            startActivity(intent)
        }
        binding.SquareHectareConverter.setOnClickListener {
            val intent=Intent(this,Hectare_List::class.java)
            startActivity(intent)
        }
        binding.SquareAcreConverter.setOnClickListener {
            val intent=Intent(this,Acre_list::class.java)
            startActivity(intent)
        }
    }
}