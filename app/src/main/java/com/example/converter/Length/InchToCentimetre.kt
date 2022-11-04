package com.example.converter.Length

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.LengthCalculationBinding

class InchToCentimetre : AppCompatActivity() {
    private lateinit var binding: LengthCalculationBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LengthCalculationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolBarName.text = "Inch To Centimetre"
        binding.tvName.text = "Inch To Centimetre"
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.convertButton.setOnClickListener {
            if (binding.etFiled.text.toString().isNotEmpty()) {
                binding.tvResult.text = "Result: " + (binding.etFiled.text.toString()
                    .toFloat() * 2.54).toString() + " (Centimetre)"
            } else {
                binding.etFiled.error = "Insert Values"
            }
        }
    }
}