package org.test.eventos.models

import java.util.*

data class Evento(val nombre: String,
                  val imagen: String,
                  val fecha: Date,
                  val lugar: String,
                  val telefono: String,
                  val descripcion: String
)