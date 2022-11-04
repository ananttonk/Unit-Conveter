package com.example.converter.Length

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.KilometreConverterBinding

class KilometreConverter:AppCompatActivity() {
    private lateinit var binding:KilometreConverterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= KilometreConverterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.kiloToMetre.setOnClickListener {
            val intent=Intent(this,KilometreToMetre::class.java)
            startActivity(intent)
        }
        binding.kiloToCenti.setOnClickListener {
            val intent=Intent(this,KilometreToCentimetre::class.java)
            startActivity(intent)
        }
        binding.kiloToFoot.setOnClickListener {
            val intent=Intent(this,KilometreToFoot::class.java)
            startActivity(intent)
        }
        binding.kiloToMile.setOnClickListener {
            val intent=Intent(this,KilometreToMile::class.java)
            startActivity(intent)
        }
        binding.kiloToInch.setOnClickListener {
            val intent=Intent(this,KilometreToInch::class.java)
            startActivity(intent)
        }
    }
}