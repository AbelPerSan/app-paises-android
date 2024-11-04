package com.example.buttonnavigationapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.paisactivity.PaisActivity
import com.example.paisactivity.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtener referencia al botón
        val btnNavigate = findViewById<Button>(R.id.btnNavigate)

        // Configurar el evento onClick para navegar a PaisActivity
        btnNavigate.setOnClickListener {
            val intent = Intent(this, PaisActivity::class.java)
            startActivity(intent)
        }
    }
}
