package com.com.zajecia5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.com.zajecia5.databinding.ActivityInsertDataBinding

class InsertData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityInsertDataBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}