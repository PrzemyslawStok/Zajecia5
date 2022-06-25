package com.com.zajecia5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.com.zajecia5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addDataButton = binding.addDataButton

        addDataButton.setOnClickListener {
            val intent = Intent(this, InsertData::class.java)
            startActivity(intent)
        }
    }
}