package com.example.miprimeravez

var nombre1 = "HOLA"
//Variables
val name:String = "Daniel"
val age:Int = 23
val age2:Byte = 23

fun main() {
    //println("Hola Mundo Kotlin!!! $name")
    //println(add(23 ,200))
    //ifAnidado()
    getMonth(13)
}

fun add(x:Int, y:Int=50):Int = x+y

fun ifAnidado() {
    val animal = "dog"
    val city = "Pasto"
    if (animal == "dog" || animal=="perro") {
        println("Es un perro")
    }else if (animal == "cat" && city=="Pasto") {
        println("Es un gato Pastuso")
    }else if (animal == "bird") {
        println("Es un pajaro")
    }else{
        println("No es uno de los animales esperados")
    }
}

fun getMonth(month:Int) {
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("MAyo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("No es un mes valido")
    }
}



fun getTrimester(month:Int) {
    when(month) {
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Mes no valido")
    }
}

fun getSemester(month:Int) = when(month){
        in 1..6 -> "Primer Semestre"
        in 7..12 -> "Segundo Semestre"
        !in 1..12 -> "mes no valido"
        else -> "aljg ljla"
    }
