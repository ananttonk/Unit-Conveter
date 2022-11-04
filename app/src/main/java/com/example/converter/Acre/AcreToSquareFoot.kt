package com.example.converter.Acre

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.CalculationActivityBinding

class AcreToSquareFoot:AppCompatActivity() {
    private lateinit var binding: CalculationActivityBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CalculationActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.tvName.text = "Acre To SquareFoot"
        binding.toolBarName.text = "Acre To SquareFoot"
        binding.convertButton.setOnClickListener {
            val text = binding.etFiled.text.toString()
            if (text.isNotBlank() && text.isNotEmpty()) {
                binding.tvResult.text = "result:" +
                        (binding.etFiled.text.toString()
                            .toFloat() * 43560).toString() + " (SquareFoot)"
            } else {
                binding.etFiled.error = "Insert Values"
            }
        }
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
    }
}