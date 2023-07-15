package com.example.menudo
fun main() {
    var usuarios = mutableListOf<Usuario>()
    println("ingrese cantidad usuarios")
    val cantidadUsuarios = readln().toInt()
    for (i in 1..cantidadUsuarios) {
        println("ingresar nombre ")

        var nombre = readln()
        while (validarNombre(nombre)) {
            println("nombre invalido, ingresar nombre valido")
            nombre = readln()
        }

        var apellido = readln().toString()
        while (validarApellido(apellido)) {
            println("apellido invalido, ingresar apellido valido")
            apellido = readln()
        }

        var edad = readln().toInt()
        while (validarEdad(edad)) {
            println("edad invalida, ingresar edad valido")
            edad = readln().toInt()
        }
        var correo = readln()
        while (validarCorreo(correo)) {
            println("correo invalido, ingresar correo valido")
            correo = readln()
        }

        var sistemaSalud = readln()
        while (validarsistemaSalud(sistemaSalud)) {
            println("ingrese Sistema de Salud: Fonasa o Isapre")
            sistemaSalud = readln()
        }

        var usuario = Usuario(nombre, apellido, edad, correo, sistemaSalud)
        usuarios.add(usuario)
    }
}
    for( u in usuarios.sortedBY{
        usuario->usuario.edad
    }){
    println("$u")
    }



fun validarsistemaSalud(sistemaSalud: String): Boolean {
return sistemaSalud=="Fonasa"|| sistemaSalud=="Isapre"
}

fun validarCorreo(correo: String): Boolean {
    return correo.length in 10..200&& correo.contains('@')
}

fun validarEdad(edad: Int):Boolean {
    return edad in 0..150
}

fun validarApellido(apellido: String): Boolean {
   return apellido.length in 1..30
}

fun validarNombre(nombre: String) :Boolean {
 return nombre.length in 1..20 

}

data class Usuario(val nombre:String,val apellido:String,val edad: Int, val correo:String,val sistemaSalud:String)
