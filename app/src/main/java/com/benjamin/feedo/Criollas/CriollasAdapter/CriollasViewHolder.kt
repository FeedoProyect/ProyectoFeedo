package com.benjamin.feedo.Criollas.CriollasAdapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.feedo.Criollas.CriollasName
import com.benjamin.feedo.R

class CriollasViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val imCriollas = view.findViewById<ImageView>(R.id.imCriollas)
    val NombreCriollas = view.findViewById<TextView>(R.id.NombreCriollas)

    fun render(criollasModel: CriollasName){
        NombreCriollas.text = criollasModel.name
    }
}