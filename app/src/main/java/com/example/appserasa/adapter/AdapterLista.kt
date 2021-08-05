package com.example.appserasa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appserasa.R
import com.example.appserasa.model.contatos

class AdapterLista(
    var listaContatos: MutableList<contatos>,
    var interfaceListaContatos: interfaceListaContatos
) : RecyclerView.Adapter<ItensListaContatos>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItensListaContatos {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.itens_lista, parent, false)
        return ItensListaContatos(itemView)
    }

    override fun onBindViewHolder(holder: ItensListaContatos, position: Int) {

        val contatoSelecionado = listaContatos[position]

        holder.itemView.findViewById<TextView>(R.id.textNome).apply {
            contatoSelecionado.nome
        }

        holder.itemView.findViewById<TextView>(R.id.textCidade).apply {
            contatoSelecionado.cidade
        }

    }

    override fun getItemCount(): Int {
        return listaContatos.size
    }

    fun removeAt(contatos: contatos) {
        listaContatos.remove(contatos)
        notifyDataSetChanged()
    }

}

class ItensListaContatos(itemView: View) : RecyclerView.ViewHolder(itemView) {

}