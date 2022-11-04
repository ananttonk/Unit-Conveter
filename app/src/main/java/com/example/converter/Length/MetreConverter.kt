package com.example.converter.Length

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.MetreConverterBinding

class MetreConverter : AppCompatActivity() {
    private lateinit var binding: MetreConverterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MetreConverterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.metreToKilo.setOnClickListener {
            val intent = Intent(this, MetreToKilometre::class.java)
            startActivity(intent)
        }
        binding.MetreToCentimetre.setOnClickListener {
            val intent = Intent(this, MetreToCentimetre::class.java)
            startActivity(intent)
        }
        binding.MetreToFoot.setOnClickListener {
            val intent = Intent(this, MetreToFoot::class.java)
            startActivity(intent)
        }
        binding.MetreToInch.setOnClickListener {
            val intent = Intent(this, MetreToInch::class.java)
            startActivity(intent)
        }
        binding.MetreToMile.setOnClickListener {
            val intent = Intent(this, MetreToMile::class.java)
            startActivity(intent)
        }
    }
}