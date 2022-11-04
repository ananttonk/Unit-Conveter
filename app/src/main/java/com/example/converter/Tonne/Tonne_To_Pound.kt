package com.example.converter.Tonne

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.CalculationActivityBinding

class Tonne_To_Pound : AppCompatActivity() {
    private lateinit var binding: CalculationActivityBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CalculationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.tvName.text = "Tonne To Pound"
        binding.toolBarName.text="Tonne To Pound"
        binding.convertButton.setOnClickListener {
            val text = binding.etFiled.text.toString()
            if (text.isNotBlank() && text.isNotEmpty()) {
                binding.tvResult.text = "Result:" +
                        (binding.etFiled.text.toString().toFloat() * 2205).toString() + " (Pound)"
            } else {
                binding.etFiled.error = "Insert Values"
            }
        }
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
    }
}