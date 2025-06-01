package com.benjamin.feedo.CatalogoAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.feedo.CatalogosName
import com.benjamin.feedo.R

class CatalogoAdapter(private val catalogosList: List<CatalogosName>):
    RecyclerView.Adapter<CatalogoViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CatalogoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_catalogo, parent, false)
        return CatalogoViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CatalogoViewHolder,
        position: Int
    ) {
        holder.render(catalogosList[position])
    }

    override fun getItemCount() = catalogosList.size
}