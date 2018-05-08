package org.test.eventos.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.template_evento.view.*
import org.test.eventos.R
import org.test.eventos.models.Evento
import org.test.eventos.util.inflate

class EventoAdapter:RecyclerView.Adapter<EventoViewHolder>(){

    var data:List<Evento> = emptyList()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventoViewHolder =
            EventoViewHolder(parent.inflate(R.layout.template_evento))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: EventoViewHolder, position: Int) {
        holder.bind(data[position])
    }

}

class EventoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(evento:Evento){
        itemView.name.text = evento.nombre
        itemView.loc.text = evento.lugar
        itemView.phone.text = evento.telefono
        itemView.img.setImageURI(evento.imagen)
    }
}