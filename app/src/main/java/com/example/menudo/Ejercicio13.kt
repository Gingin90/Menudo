package com.example.menudo

import kotlin.math.ceil


fun main(){
var resultado = suma(5.5, 6.4F)
     println(resultado )
var redondeo = redondeo(param1 = 7.1)
    println(redondeo)
 }

fun suma (param1:Double,param2:Float):Double=  param1 + param2

fun redondeo (param1: Double)= ceil(param1)




