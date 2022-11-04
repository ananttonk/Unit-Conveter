package com.example.converter.Length

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.InchConverterBinding

class InchConverter:AppCompatActivity() {
    private lateinit var binding: InchConverterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= InchConverterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.InchToCentimetre.setOnClickListener {
            val intent= Intent(this,InchToCentimetre::class.java)
            startActivity(intent)
        }
        binding.InchToMetre.setOnClickListener {
            val intent= Intent(this,InchToMetre::class.java)
            startActivity(intent)
        }
        binding.inchToMile.setOnClickListener {
            val intent= Intent(this,InchToMile::class.java)
            startActivity(intent)
        }
        binding.InchToKilo.setOnClickListener {
            val intent= Intent(this,InchToKilo::class.java)
            startActivity(intent)
        }
        binding.InchToFoot.setOnClickListener {
            val intent= Intent(this,InchToFoot::class.java)
            startActivity(intent)
        }
    }
}