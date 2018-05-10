package org.test.eventos.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.template_evento.view.*
import kotlinx.android.synthetic.main.template_promocion.view.*
import org.test.eventos.R
import org.test.eventos.databinding.TemplateEventoBinding
import org.test.eventos.models.Evento
import org.test.eventos.models.ItemEvent
import org.test.eventos.models.Promocion
import org.test.eventos.util.inflate

class EventoAdapter(val onClick:((pos:Int, type:Int)->Unit)? = null):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

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
            is EventoViewHolder -> holder.bind(data[position] as Evento, position, onClick)
            is PromocionViewHolder -> holder.bind(data[position] as Promocion, position, onClick)
        }
    }

    override fun getItemViewType(position: Int): Int = data[position].getType()

    fun onClickEvent(pos:Int, type:Int){
        onClick?.invoke(pos, type)
    }

}

class EventoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding:TemplateEventoBinding = TemplateEventoBinding.bind(view)

    fun bind(evento:Evento,pos:Int,
             onClick:((pos:Int, type:Int)->Unit)?=null){

        binding.evento = evento
        itemView.setOnClickListener{
            onClick?.invoke(pos, ItemEvent.TYPE_EVENT)
        }
    }
}

class PromocionViewHolder(view:View): RecyclerView.ViewHolder(view){
    fun bind(promo:Promocion, pos:Int,  onClick:((pos:Int, type:Int)->Unit)?=null){
        itemView.namePromo.text = promo.nombre
        itemView.place.text = promo.lugar
        itemView.imgPlace.setImageURI(promo.lugarImagen)
        itemView.imgPromo.setImageURI(promo.imagen)
        itemView.setOnClickListener{
            onClick?.invoke(pos, ItemEvent.TYPE_PROMO)
        }
    }
}