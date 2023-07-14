package com.example.menudo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


fun main() {
    var numero1 = 10
    val numero2 = 33
    val numero3 = 66

    var resultado: int= numero1 + numero2 + numero3

        println ( resultado)

    numero1 = 55

    resultado = numero1 + numero2 + numero3
    
    println ( resultado)

    val promedio:int = resultado / 3

    println("el promedio es:$promedio")
      }



