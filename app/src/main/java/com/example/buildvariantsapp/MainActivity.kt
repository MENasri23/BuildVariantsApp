package com.example.buildvariantsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        tvWelcome.text = getString(R.string.welcome)
    }
}