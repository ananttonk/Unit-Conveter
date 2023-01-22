package com.example.converter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.Length.Length_Menu
import com.example.converter.Temperature.Temperature_Menu
import com.example.converter.databinding.HomePageBinding

class HomeConverter : AppCompatActivity() {
    private lateinit var binding: HomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.massConverter.setOnClickListener {
            val intent = Intent(this, Converter_Menu::class.java)
            startActivity(intent)
        }
        binding.temperature.setOnClickListener {
            val intent = Intent(this, Temperature_Menu::class.java)
            startActivity(intent)
        }
        binding.lengthConverter.setOnClickListener {
            val intent = Intent(this, Length_Menu::class.java)
            startActivity(intent)
        }
        binding.energyConverter.setOnClickListener {
            val intent = Intent(this, Energy_Menu::class.java)
            startActivity(intent)
        }
        binding.AreaConverter.setOnClickListener {
            val intent = Intent(this, Area_Menu::class.java)
            startActivity(intent)
        }
    }
}