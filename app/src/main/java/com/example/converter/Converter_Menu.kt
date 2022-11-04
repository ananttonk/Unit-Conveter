package com.example.converter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.Gram.Gram_List_Page
import com.example.converter.Kg.Kg_List_Page
import com.example.converter.Ounce.Ounce_List_Page
import com.example.converter.Pound.Pound_List_Page
import com.example.converter.Stone.StoneList
import com.example.converter.Tonne.Tonne_List_Page
import com.example.converter.databinding.ConverterMenuPageBinding

class Converter_Menu : AppCompatActivity() {
    private lateinit var binding: ConverterMenuPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ConverterMenuPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.toolbarBackButton.setOnClickListener { onBackPressed() }
        binding.KGMenu.setOnClickListener {
            val kgMenu = Intent(this, Kg_List_Page::class.java)
            startActivity(kgMenu)
        }
        binding.PoundMenu.setOnClickListener {
            val poundMenu = Intent(this, Pound_List_Page::class.java)
            startActivity(poundMenu)
        }
        binding.OunceMenu.setOnClickListener {
            val ounceMenu = Intent(this, Ounce_List_Page::class.java)
            startActivity(ounceMenu)
        }
        binding.GramMenu.setOnClickListener {
            val gramMenu = Intent(this, Gram_List_Page::class.java)
            startActivity(gramMenu)
        }
        binding.TonneMenu.setOnClickListener {
            val tonneMenu = Intent(this, Tonne_List_Page::class.java)
            startActivity(tonneMenu)
        }
        binding.StoneMenu.setOnClickListener {
            val stoneMenu = Intent(this, StoneList::class.java)
            startActivity(stoneMenu)
        }
    }
}