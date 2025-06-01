package com.benjamin.feedo.Riquisimas.RiquisimasAdapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.feedo.R
import com.benjamin.feedo.Riquisimas.RiquisimasName

class RiquisimasViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val imRiquisimas = view.findViewById<ImageView>(R.id.imRiquisimas)
    val NombreRiquisimas = view.findViewById<TextView>(R.id.NombreRiquisimas)

    fun render(riquisimasModel: RiquisimasName){
        NombreRiquisimas.text = riquisimasModel.name
    }
}