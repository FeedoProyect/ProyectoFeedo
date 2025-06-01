package com.benjamin.feedo.Rapidas.RapidasAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.feedo.R
import com.benjamin.feedo.Rapidas.RapidasName

class RapidasAdapter(private val riquisimasList: List<RapidasName>): RecyclerView.Adapter<RapidasViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RapidasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rapidas, parent, false)
        return RapidasViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: RapidasViewHolder,
        position: Int
    ) {
        holder.render(riquisimasList[position])
    }

    override fun getItemCount() = riquisimasList.size
}