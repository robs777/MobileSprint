package com.example.sp1dentipineu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        buttonLogin = findViewById(R.id.btnLogin)
        buttonLogin.setOnClickListener{
            val navegarLogin = Intent(this,TelaGeral::class.java)
            startActivity(navegarLogin)
        }


    }
}