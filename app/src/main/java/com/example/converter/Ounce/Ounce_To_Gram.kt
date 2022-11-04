package com.example.converter.Ounce

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.CalculationActivityBinding

class Ounce_To_Gram : AppCompatActivity() {
    private lateinit var bindind: CalculationActivityBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindind = CalculationActivityBinding.inflate(layoutInflater)
        setContentView(bindind.root)
        supportActionBar?.hide()
        bindind.tvName.text = "Ounce To Gram"
        bindind.toolBarName.text="Ounce To Gram"
        bindind.convertButton.setOnClickListener {
            val text = bindind.etFiled.text.toString()
            if (text.isNotEmpty() && text.isNotBlank()) {
                bindind.tvResult.text = "Result:" +
                        (bindind.etFiled.text.toString().toFloat() * 28.35).toString() + " (Gram)"
            } else {
                bindind.etFiled.error = "Insert Values"
            }
        }
        bindind.toolbarBackButton.setOnClickListener { onBackPressed() }
    }
}