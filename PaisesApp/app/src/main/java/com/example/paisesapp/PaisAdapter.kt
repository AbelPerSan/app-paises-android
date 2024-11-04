package com.example.paisesapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PaisAdapter(
    private val context: Context,
    private val countries: List<Pais>
) : RecyclerView.Adapter<PaisAdapter.PaisViewHolder>() {

    inner class PaisViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val bandera: ImageView = view.findViewById(R.id.bandera)
        val pais_nombre: TextView = view.findViewById(R.id.pais_nombre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaisViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pais_card, parent, false)
        return PaisViewHolder(view)
    }

    override fun onBindViewHolder(holder: PaisViewHolder, position: Int) {
        val pais = countries[position]
        holder.pais_nombre.text = pais.nombre
        holder.bandera.setImageResource(pais.bandera)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, PaisInfoActivity::class.java).apply {
                putExtra("pais_nombre", pais.nombre)
                putExtra("pais_descripcion", pais.descripcion)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = countries.size
}
