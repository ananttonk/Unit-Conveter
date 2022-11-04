package com.example.converter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.Foot_Pound.Foot_Pound_List
import com.example.converter.Gramcalorie.GramCalorie_List
import com.example.converter.KiloCalorie.KiloCalorie_list
import com.example.converter.KiloJoule.KiloJoule_List
import com.example.converter.WattHour.WattHour_List
import com.example.converter.databinding.EnergyListBinding
import com.example.converter.joule.Joule_List_Page

class Energy_Menu : AppCompatActivity() {
    private lateinit var binding: EnergyListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EnergyListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.jouleConverter.setOnClickListener {
            val intent = Intent(this, Joule_List_Page::class.java)
            startActivity(intent)
        }
        binding.kilojouleConverter.setOnClickListener {
            val intent=Intent(this,KiloJoule_List::class.java)
            startActivity(intent)
        }
        binding.GramCalorieConverter.setOnClickListener {
            val intent=Intent(this,GramCalorie_List::class.java)
            startActivity(intent)
        }
        binding.KiloCalorieConverter.setOnClickListener {
            val intent=Intent(this,KiloCalorie_list::class.java)
            startActivity(intent)
        }
        binding.wattHourConverter.setOnClickListener {
            val intent=Intent(this,WattHour_List::class.java)
            startActivity(intent)
        }
        binding.FootPoundConverter.setOnClickListener {
            val intent=Intent(this ,Foot_Pound_List::class.java)
            startActivity(intent)
        }
    }
}