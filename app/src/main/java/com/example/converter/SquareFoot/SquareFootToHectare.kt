package com.example.converter.SquareFoot

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.CalculationActivityBinding

class SquareFootToHectare:AppCompatActivity() {
    private lateinit var binding: CalculationActivityBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CalculationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.tvName.text = "SquareFoot To Hectare"
        binding.toolBarName.text = "SquareFoot To Hectare"
        binding.convertButton.setOnClickListener {
            val text = binding.etFiled.text.toString()
            if (text.isNotBlank() && text.isNotEmpty()) {
                binding.tvResult.text = "result:" +
                        (binding.etFiled.text.toString()
                            .toFloat() / 107639.0).toString() + " (Hectare)"
            } else {
                binding.etFiled.error = "Insert Values"
            }
        }
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
    }
}