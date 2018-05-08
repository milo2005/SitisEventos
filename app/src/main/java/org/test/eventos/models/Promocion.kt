package org.test.eventos.models

class Promocion(val nombre:String, val imagen:String,
                val lugar:String, val lugarImagen:String,
                val descripcion:String):ItemEvent(){

    override fun getType(): Int = TYPE_PROMO

}