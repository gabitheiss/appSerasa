package com.example.appserasa.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appserasa.model.contatos

class AdapterLista (
    var listaContatos: MutableList<contatos>,
    var interfaceListaContatos: interfaceListaContatos) : RecyclerView.Adapter<itensListaContatos>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itensListaContatos {

    }

    override fun onBindViewHolder(holder: itensListaContatos, position: Int) {

    }

    override fun getItemCount(): Int {

    }


}







class itensListaContatos (itemView : View) : RecyclerView.ViewHolder(itemView){

}