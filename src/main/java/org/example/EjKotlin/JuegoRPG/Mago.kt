package org.example.EjKotlin.JuegoRPG



class Mago(nombre: String, vidaMax: Int) : Personaje(nombre, vidaMax) {
    fun lanzarHechizo(enemigo: Personaje, hechizo: Hechizo) {
        println("$nombre lanza  ${hechizo.nombre} causando  ${hechizo.danio} de daño.")
        enemigo.recibirDanio(hechizo.danio)
    }
}