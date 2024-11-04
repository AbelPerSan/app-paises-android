package com.example.paisesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class PaisInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pais_info)

        val nombrePais = intent.getStringExtra("pais_nombre")
        val descripcionPais = intent.getStringExtra("pais_descripcion")

        findViewById<TextView>(R.id.pais_nombre).text = nombrePais
        findViewById<TextView>(R.id.pais_descripcion).text = descripcionPais
    }
}
