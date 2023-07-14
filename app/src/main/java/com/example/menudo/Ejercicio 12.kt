package com.example.menudo


fun main(){
    var usuarios = mutableListOf<Usuario>()
    println("ingrese cantidad usuarios")
    val cantidadUsuarios = readln().toInt()
    for( i in 1..cantidadUsuarios){
        println("ingresar nombre ")
        var nombre = readln()
        while ( validarNombre(nombre)){
            println("nombre invalido, ingresar nombre valido")
            nombre= readln()
        }
    
        var apellido = readln().toString()
        validarApellido(apellido)
        var edad = readln().toInt()
        validarEdad(edad)
        var correo = readln()
        validarCorreo(correo)
        
        var sistemaSalud =readln()
        validarsistemaSalud(sistemaSalud)
        var usuario=  Usuario(nombre, apellido, edad, correo, sistemaSalud)
        usuarios.add(usuario)
    }
    for(u in usuarios){
     println(u)

       }

}

fun validarsistemaSalud(sistemaSalud: String) {

}

fun validarCorreo(correo: String) {

}

fun validarEdad(edad: Int) {

}

fun validarApellido(apellido: String) {

}

fun validarNombre(nombre: String) :Boolean {
 return nombre.length in 1..20 
}

data class Usuario(var nombre:String,var apellido:String,var edad: Int, var correo:String,var sistemaSalud:String)
