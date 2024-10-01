package com.example.sp1dentipineu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaSintomas : AppCompatActivity() {

    lateinit var btnIrScanner: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_sintomas)

        btnIrScanner= findViewById(R.id.btnIrScanner)
        btnIrScanner.setOnClickListener{
            val navegarLogin = Intent(this,TelaCamera::class.java)
            startActivity(navegarLogin)
        }







    }

}