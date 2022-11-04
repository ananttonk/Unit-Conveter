package com.example.converter.Length

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.CentimetreConverterBinding

class CentimetreConverter : AppCompatActivity() {
    private lateinit var binding: CentimetreConverterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CentimetreConverterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.centiToKilo.setOnClickListener {
            val intent = Intent(this, CentimetreToKilometre::class.java)
            startActivity(intent)
        }
        binding.centiToMetre.setOnClickListener {
            val intent = Intent(this, CentimetreToMetre::class.java)
            startActivity(intent)
        }
        binding.centiToFoot.setOnClickListener {
            val intent = Intent(this, CentimetreToFoot::class.java)
            startActivity(intent)
        }
        binding.centiToMile.setOnClickListener {
            val intent = Intent(this, CentimetreToMile::class.java)
            startActivity(intent)
        }
        binding.centiToInch.setOnClickListener {
            val intent = Intent(this, CentiMetreToInch::class.java)
            startActivity(intent)
        }
    }
}