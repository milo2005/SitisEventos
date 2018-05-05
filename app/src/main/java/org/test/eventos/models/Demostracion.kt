package org.test.eventos.models

import android.util.Log

//Variables
var edad: Int = 100
val nombre: String = "Dario Chamorro"

var apellido: String? = null

lateinit var hola: String

const val PI = 3.1452433

//Funciones

fun saludar(): Unit {

}

fun saludar2() {

}

fun sumar(n1: Int, n2: Int = 0): Int {
    return n1 + n2
}

fun sumar2(n1: Int, n2: Int): Int = n1 + n2


val rta = sumar(3, 4)

val rta2 = sumar(n2 = 3, n1 = 5)

val rta3 = sumar(2)

fun Int.add(n2: Int) = this + n2

val rta4 = 4.add(9)

infix fun Int.mul(n: Int) = this * n

val rta5 = 4 mul 9


fun operar(n1: Int, n2: Int, result: (rta: Int) -> Unit) {
    result(n1 + n2)
}

fun ejemplo() {
    operar(2, 4, { rta -> Log.i("Resultado", "$rta") })

    operar(2, 4, { Log.i("Resultado", "$it") })

    operar(2, 4) { rta -> Log.i("Resultado", "$rta") }
}


// Controles de flujo

fun ejemplo2(){


    if(4<6){

    }else{

    }

    val valor = if(2>8) 8 else 9



    when("Hola"){
        "chao" -> {}
        else -> Log.i("Resultado", "No se cumple")
    }

    val numero = 3

    when(numero){
        in 1..4 -> {}
        7-> {}
        in 9 until 12 ->{}
    }

    val valor2:Any = 4

    when(valor2){
        is String ->{

        }
        is Int ->{

        }
    }

    var frutas:List<String> = listOf("manzana","pera","piña")

    for(f in frutas){

    }

    for(i in 0 until frutas.size){

    }
}


fun valor(n:Int) =  if(n>8) 7 else 2


//Arreglos

val colores:List<String> = emptyList()
val colores1:List<String> = listOf("" ,"")

val nombres:MutableList<String> = mutableListOf("")

fun ejemplo3(){
    nombres.add("")
    val nombre = nombres[0]
    nombres[1] = ""


    val longitudes = nombres.map { it.length }

    nombres.filter { it == "Dario" }
            .forEach{element-> }
}


// Clases

open class Usuario(val nombre:String,val cedula:String?){

    lateinit var telefono:String

    constructor(nombre:String):this(nombre, null)


}

val usr = Usuario("DArio", "123")

fun ejemplo5(){

}


class Admin(nombre:String):Usuario(nombre)

data class Evento1(val nombre:String, val duracion:Int)
