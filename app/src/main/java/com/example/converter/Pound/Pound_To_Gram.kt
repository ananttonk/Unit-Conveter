package com.example.converter.Pound

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.CalculationActivityBinding

class Pound_To_Gram : AppCompatActivity() {
    private lateinit var binding: CalculationActivityBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CalculationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.tvName.text = "Pound To Gram"
        binding.toolBarName.text="Pound To Gram"
        binding.convertButton.setOnClickListener {
            val text = binding.etFiled.text.toString()
            if (text.isNotEmpty() && text.isNotBlank()) {
                binding.tvResult.text = "Result:" +
                        (binding.etFiled.text.toString().toFloat() * 454.0).toString() + " (Gram)"
            } else {
                binding.etFiled.error = "Insert Values"
            }
        }
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
    }
}