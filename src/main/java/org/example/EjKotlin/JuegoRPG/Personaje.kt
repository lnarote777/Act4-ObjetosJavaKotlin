package org.example.EjKotlin.JuegoRPG

open class Personaje(var nombre: String, var puntosVida: Int) {
    fun estaVivo(): Boolean {
        return puntosVida > 0
    }

    fun recibirDanio(danio: Int) {
        puntosVida -= danio
        println("$nombre recibió $danio de daño. Vida restante: $puntosVida")
    }
}