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
        while ( validarApellido(apellido)) {
            println("apellido invalido, ingresar apellido valido")
            apellido = readln()
        }

        var edad = readln().toInt()
        while ( validarEdad(edad)) {
            println("edad invalida, ingresar edad valido")
            edad = readln().toInt()
        }


        var correo = readln()
        while ( validarCorreo(correo) {
            println("correo invalido, ingresar correo valido")
            correo = readln()

        
        var sistemaSalud =readln()
        validarsistemaSalud(sistemaSalud)
        var usuario=  Usuario(nombre, apellido, edad, correo, sistemaSalud)
        usuarios.add(usuario)
    }

    for(u in usuarios.startedBy {
        usuario -> usuario.edad
    }){
     println($u)

       }

}
fun validarsistemaSalud(sistemaSalud: String) {
return sistemaSalud=="Fonasa"
}

fun validarCorreo(correo: String) {
    return
}

fun validarEdad(edad: Int):Boolean {
    return
}

fun validarApellido(apellido: String) {
   return
}

fun validarNombre(nombre: String) :Boolean {
 return nombre.length in 1..20 

}

data class Usuario(var nombre:String,var apellido:String,val edad: Int, var correo:String,var sistemaSalud:String)
