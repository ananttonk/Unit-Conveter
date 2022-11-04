package com.example.converter.Length

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.FootConverterBinding

class FootConverter : AppCompatActivity() {
    private lateinit var binding: FootConverterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FootConverterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.footToKilo.setOnClickListener {
            val intent = Intent(this, FootToKilo::class.java)
            startActivity(intent)
        }
        binding.footToMetre.setOnClickListener {
            val intent = Intent(this, FootToMetre::class.java)
            startActivity(intent)
        }
        binding.footToCentimetre.setOnClickListener {
            val intent = Intent(this, FootToCentimetre::class.java)
            startActivity(intent)
        }
        binding.footToMile.setOnClickListener {
            val intent = Intent(this, FootToMile::class.java)
            startActivity(intent)
        }
        binding.footToInch.setOnClickListener {
            val intent = Intent(this, FootToInch::class.java)
            startActivity(intent)
        }
    }
}