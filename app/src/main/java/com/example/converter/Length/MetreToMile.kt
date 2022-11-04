package com.example.converter.Length

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.LengthCalculationBinding

class MetreToMile:AppCompatActivity() {
    private lateinit var binding: LengthCalculationBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LengthCalculationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolBarName.text = "Metre To Mile"
        binding.tvName.text = "Metre To Mile"
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.convertButton.setOnClickListener {
            if (binding.etFiled.text.toString().isNotEmpty()) {
                binding.tvResult.text = "Result: " + (binding.etFiled.text.toString()
                    .toFloat() /1609.0).toString() + " (Mile)"
            } else {
                binding.etFiled.error = "Insert Values"
            }
        }
    }
}