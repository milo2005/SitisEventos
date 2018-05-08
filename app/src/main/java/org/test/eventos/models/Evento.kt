package org.test.eventos.models

import java.util.*

class Evento(val nombre: String,
                  val imagen: String,
                  val fecha: Date,
                  val lugar: String,
                  val telefono: String,
                  val descripcion: String
):ItemEvent(){

    override fun getType(): Int = TYPE_EVENT

}