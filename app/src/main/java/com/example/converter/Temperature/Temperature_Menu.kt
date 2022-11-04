package com.example.converter.Temperature

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.TemperatureListBinding

class Temperature_Menu : AppCompatActivity() {
    private lateinit var binding: TemperatureListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TemperatureListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.CToF.setOnClickListener {
            val intent = Intent(this, CelsiusToFahrenheit::class.java)
            startActivity(intent)
        }
        binding.CtoK.setOnClickListener {
            val intent = Intent(this, CelsiusToKelvin::class.java)
            startActivity(intent)
        }
        binding.FtoC.setOnClickListener {
            val intent = Intent(this, FahrenheitToCelsius::class.java)
            startActivity(intent)
        }
        binding.FtoK.setOnClickListener {
            val intent = Intent(this, FahrenheitToKelvin::class.java)
            startActivity(intent)
        }
        binding.KtoC.setOnClickListener {
            val intent = Intent(this, KelvinToCelsius::class.java)
            startActivity(intent)
        }
        binding.KtoF.setOnClickListener {
            val intent = Intent(this, KelvinToFahrenheit::class.java)
            startActivity(intent)
        }
    }
}