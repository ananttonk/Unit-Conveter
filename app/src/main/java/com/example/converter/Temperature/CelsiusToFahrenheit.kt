package com.example.converter.Temperature

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.TemperatureCalculatorBinding

class CelsiusToFahrenheit : AppCompatActivity() {
    private lateinit var binding: TemperatureCalculatorBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TemperatureCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.toolBarName.text = "Celsius To Fahrenheit"
        binding.tvName.text = "Celsius To Fahrenheit"
        binding.convertButton.setOnClickListener {
            if (binding.etFiled.text.toString().isNotEmpty()) {
                binding.tvResult.text = "Result: " +
                        ((binding.etFiled.text.toString().toFloat() * 1.8) + 32).toString()+" (Fahrenheit)"
            } else {
                binding.etFiled.error = "Insert Values"
            }
        }
    }
}