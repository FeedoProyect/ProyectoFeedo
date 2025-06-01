package com.benjamin.feedo.Riquisimas.RiquisimasAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.feedo.R
import com.benjamin.feedo.Riquisimas.RiquisimasName

class RiquisimasAdapter(private val riquisimasList: List<RiquisimasName>):
    RecyclerView.Adapter<RiquisimasViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RiquisimasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_riquisimas, parent, false)
        return RiquisimasViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: RiquisimasViewHolder,
        position: Int
    ) {
        holder.render(riquisimasList[position])
    }

    override fun getItemCount() = riquisimasList.size

}