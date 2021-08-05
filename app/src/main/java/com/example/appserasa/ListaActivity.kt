package com.example.appserasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appserasa.model.contatos

class ListaActivity : AppCompatActivity() {


    private lateinit var recyclerViewLista : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)


        val listaContatos = mutableListOf<contatos>(
            contatos("Gabriela","Blumenau"),
            contatos("Pedro", "São Paulo"),
            contatos("Andreza", "Rio de Janeiro"),
            contatos("Carla", "Curitiba"),
            contatos("Paula", "Recife"),
            contatos("João", "Porto Alegre"),
            contatos("Bruna", "Joinville"),
        )
        recyclerViewLista = findViewById(R.id.recyclerViewLista)
        recyclerViewLista.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }


}