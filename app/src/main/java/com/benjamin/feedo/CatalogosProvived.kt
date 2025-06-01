package com.benjamin.feedo


/* Catalogos : Desayunos , Almuerzos, Meriendas, Cenas, Snacks, Vegetarianas, Pastas

*/
class CatalogosProvived{
    companion object{
        val ListaComidas = mutableListOf<CatalogosName>(
            CatalogosName(name = "Desayunos"),
            CatalogosName(name = "Almuerzos"),
            CatalogosName(name = "Meriendas"),
            CatalogosName(name = "Cena"),
            CatalogosName(name = "Snacks"),
            CatalogosName(name = "Vegetarianas"),
            CatalogosName(name = "Pastas"),
        )
    }
}