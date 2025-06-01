package com.benjamin.feedo.CatalogoAdapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.feedo.CatalogosName
import com.benjamin.feedo.R




class CatalogoViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val imCatalogo = view.findViewById<ImageView>(R.id.imCatalogo)
    val NameCatalogo = view.findViewById<TextView>(R.id.NameCatalogo)

    fun render(catalgosModel: CatalogosName){
        NameCatalogo.text = catalgosModel.name
    }
}