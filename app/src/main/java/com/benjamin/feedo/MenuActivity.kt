package com.benjamin.feedo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.benjamin.feedo.CatalogoAdapter.CatalogoAdapter
import com.benjamin.feedo.Criollas.CriollasAdapter.CriollasAdapter
import com.benjamin.feedo.Criollas.CriollasProvived
import com.benjamin.feedo.Rapidas.RapidasAdapter.RapidasAdapter
import com.benjamin.feedo.Rapidas.RapidasProvived
import com.benjamin.feedo.Riquisimas.RiquisimasAdapter.RiquisimasAdapter
import com.benjamin.feedo.Riquisimas.RiquisimasProvived

class MenuActivity : AppCompatActivity() {

    //declaracion de RecyclerView
    private lateinit var rvCatalogo: RecyclerView
    private lateinit var rvRapidas: RecyclerView
    private lateinit var rvRiquisimas: RecyclerView
    private lateinit var rvCriollas: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        CriollasProvived.ListaCriolla
        RapidasProvived.ListaRapidas
        RiquisimasProvived.ListaRiquisimas
        CatalogosProvived.ListaComidas
        initComponent()
        initUI()
    }

    private fun initComponent(){
        //Inicializacion de componentes
        rvCatalogo = findViewById<RecyclerView>(R.id.rvCatalogos)
        rvRapidas = findViewById<RecyclerView>(R.id.rvRapidas)
        rvRiquisimas = findViewById<RecyclerView>(R.id.rvRiquisimas)
        rvCriollas = findViewById<RecyclerView>(R.id.rvCriollas)
    }

    private fun initUI(){
        rvCatalogo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCatalogo.adapter = CatalogoAdapter(CatalogosProvived.ListaComidas)

        rvRapidas.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvRapidas.adapter = RiquisimasAdapter(RiquisimasProvived.ListaRiquisimas)

        rvRiquisimas.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvRiquisimas.adapter = RapidasAdapter(RapidasProvived.ListaRapidas)

        rvCriollas.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCriollas.adapter = CriollasAdapter(CriollasProvived.ListaCriolla)
    }
}