package com.example.converter.Tonne

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.CalculationActivityBinding

class Tonne_To_Stone : AppCompatActivity() {
    private lateinit var binding: CalculationActivityBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CalculationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.tvName.text = "Tonne To Stone"
        binding.toolBarName.text="Tonne To Stone"
        binding.convertButton.setOnClickListener {
            val text = binding.etFiled.text.toString()
            if (text.isNotEmpty() && text.isNotBlank()) {
                binding.tvResult.text = "Result:" +
                        (binding.etFiled.text.toString().toFloat() * 157).toString() + " (Stone)"
            } else {
                binding.etFiled.error = "Insert Values"
            }
        }
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
    }
}