package org.test.eventos.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.template_evento.view.*
import kotlinx.android.synthetic.main.template_promocion.view.*
import org.test.eventos.R
import org.test.eventos.models.Evento
import org.test.eventos.models.ItemEvent
import org.test.eventos.models.Promocion
import org.test.eventos.util.inflate

class EventoAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    var data:List<ItemEvent> = emptyList()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            when(viewType){
                ItemEvent.TYPE_EVENT -> EventoViewHolder(parent.inflate(R.layout.template_evento))
                else -> PromocionViewHolder(parent.inflate(R.layout.template_promocion))
            }


    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is EventoViewHolder -> holder.bind(data[position] as Evento)
            is PromocionViewHolder -> holder.bind(data[position] as Promocion)
        }
    }

    override fun getItemViewType(position: Int): Int = data[position].getType()

}

class EventoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(evento:Evento){
        itemView.name.text = evento.nombre
        itemView.loc.text = evento.lugar
        itemView.phone.text = evento.telefono
        itemView.img.setImageURI(evento.imagen)
    }
}

class PromocionViewHolder(view:View): RecyclerView.ViewHolder(view){
    fun bind(promo:Promocion){
        itemView.namePromo.text = promo.nombre
        itemView.place.text = promo.lugar
        itemView.imgPlace.setImageURI(promo.lugarImagen)
        itemView.imgPromo.setImageURI(promo.imagen)
    }
}