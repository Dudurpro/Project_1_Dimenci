package com.example.project_1_dimensi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

private val appcompat: Any = TODO()

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvWelcome = findViewById<TextView>(R.id.tv_welcome)
        val btnWeb = findViewById<Button>(R.id.btn_web)
        val username = intent.getStringExtra("USERNAME")
        tvWelcome.text = "Selamat Datang, $username"
        btnWeb.setOnClickListener {
            val webIntent = Intent(Intent.ACTION_VIEW, "https://amikom.ac.id".toUri())
            startActivity(webIntent)
        }
    }
}

annotation class setContentView(val value: Int)
