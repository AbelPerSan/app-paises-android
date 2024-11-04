package com.example.paisesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaPaisActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var paisAdapter: PaisAdapter
    private val paises = listOf(
        Pais("China", R.drawable.bandera_china, "Conocida por ser el país más poblado del mundo, su cultura antigua y la modernidad de sus innovaciones tecnológicas."),
        Pais("India", R.drawable.bandera_india, "Nación diversa con rica herencia cultural, cuna de religiones y conocida por su crecimiento económico."),
        Pais("Indonesia", R.drawable.bandera_indonesia, "Archipiélago en el sudeste asiático famoso por su biodiversidad y vastas selvas tropicales."),
        Pais("Pakistán", R.drawable.bandera_pakistan, "Destacado por su singular patrimonio cultural y geografía variada, que abarca desde desiertos hasta montañas."),
        Pais("Bangladesh", R.drawable.bandera_bangladesh, "Famosa por su vida fluvial, rica cultura y avances en la industria textil."),
        Pais("Rusia", R.drawable.bandera_rusia, "País transcontinental y el más grande del mundo, conocido por su historia, vastos recursos naturales y clima extremadamente frío.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_paises)

        // Configuración del RecyclerView
        recyclerView = findViewById(R.id.recycler_view_paises)
        recyclerView.layoutManager = LinearLayoutManager(this)
        paisAdapter = PaisAdapter(this, paises)
        recyclerView.adapter = paisAdapter
    }
}
