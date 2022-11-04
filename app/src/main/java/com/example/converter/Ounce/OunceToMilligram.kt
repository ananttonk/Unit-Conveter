package com.example.converter.Ounce

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.CalculationActivityBinding

class OunceToMilligram : AppCompatActivity() {
    private lateinit var binding: CalculationActivityBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = CalculationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvName.text = "Ounce To Milligram"
        binding.toolBarName.text="Ounce To Milligram"
        binding.convertButton.setOnClickListener {
            val text = binding.etFiled.text.toString()
            if (text.isNotEmpty() && text.isNotBlank()) {
                binding.tvResult.text = "Result:" +
                        (binding.etFiled.text.toString()
                            .toFloat() * 28350).toString() + " (Milligram)"
            } else {
                binding.etFiled.error = "Insert Values"
            }
        }
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
    }
}