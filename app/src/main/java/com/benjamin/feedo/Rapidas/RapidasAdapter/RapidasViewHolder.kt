package com.benjamin.feedo.Rapidas.RapidasAdapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.feedo.R
import com.benjamin.feedo.Rapidas.RapidasName

class RapidasViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val imRapidas = view.findViewById<ImageView>(R.id.imRapidas)
    val  NombreRapidas = view.findViewById<TextView>(R.id.NombreRapidas)

    fun render(rapidasModel: RapidasName){
        NombreRapidas.text = rapidasModel.name
    }
}