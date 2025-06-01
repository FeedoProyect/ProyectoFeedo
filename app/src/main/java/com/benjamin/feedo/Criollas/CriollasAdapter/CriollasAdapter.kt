package com.benjamin.feedo.Criollas.CriollasAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.feedo.Criollas.CriollasName
import com.benjamin.feedo.R


class CriollasAdapter(private val criollaslist: List<CriollasName>):
    RecyclerView.Adapter<CriollasViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CriollasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_criollas, parent, false)
        return CriollasViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CriollasViewHolder,
        position: Int
    ) {
        holder.render(criollaslist[position])
    }

    override fun getItemCount() = criollaslist.size
}