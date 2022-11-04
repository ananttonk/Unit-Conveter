package com.example.converter.Temperature

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.TemperatureCalculatorBinding

class FahrenheitToCelsius:AppCompatActivity() {
    private lateinit var binding: TemperatureCalculatorBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TemperatureCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.toolBarName.text = "Fahrenheit To Celsius"
        binding.tvName.text = "Fahrenheit To Celsius"
        binding.convertButton.setOnClickListener {
            if (binding.etFiled.text.toString().isNotEmpty()) {
                binding.tvResult.text = "Result: " +
                        ((binding.etFiled.text.toString().toFloat()-32.0)*(5/9f)).toString()+" (Celsius)"
            } else {
                binding.etFiled.error = "Insert Values"
            }
        }
    }
}