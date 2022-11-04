package com.example.converter.Length

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.LengthListBinding

class Length_Menu : AppCompatActivity() {
    private lateinit var binding: LengthListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LengthListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.kilometreConverter.setOnClickListener {
            val intent = Intent(this, KilometreConverter::class.java)
            startActivity(intent)
        }
        binding.metreConverter.setOnClickListener {
            val intent = Intent(this, MetreConverter::class.java)
            startActivity(intent)
        }
        binding.CentimetreConverter.setOnClickListener {
            val intent = Intent(this, CentimetreConverter::class.java)
            startActivity(intent)
        }
        binding.footConverter.setOnClickListener {
            val intent = Intent(this, FootConverter::class.java)
            startActivity(intent)
        }
        binding.InchConverter.setOnClickListener {
            val intent = Intent(this, InchConverter::class.java)
            startActivity(intent)
        }
    }
}