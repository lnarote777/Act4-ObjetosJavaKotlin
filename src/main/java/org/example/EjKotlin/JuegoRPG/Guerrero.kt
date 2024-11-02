package org.example.EjKotlin.JuegoRPG

class Guerrero(nombre: String, vidaMax: Int) : Personaje(nombre, vidaMax) {
    fun atacar(enemigo: Personaje) {
        println("$nombre ataca a ${enemigo.nombre} causando 10 de daño.")
        enemigo.recibirDanio(10)
    }
}