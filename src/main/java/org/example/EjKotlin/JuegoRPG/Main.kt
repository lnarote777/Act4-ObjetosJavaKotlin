package org.example.EjKotlin.JuegoRPG

fun main() {
    //Personajes
    val guerrero = Guerrero("Thor", 50)
    val mago = Mago("Merlín", 40)
    val bolaDeFuego = Hechizo("Bola de Fuego", 15)



    while(guerrero.estaVivo() && mago.estaVivo()) {
        // Simulación de combate
        guerrero.atacar(mago)
        if (mago.estaVivo()) {
            mago.lanzarHechizo(guerrero, bolaDeFuego)
        }

        // Estado final
        println("${guerrero.nombre} - Vida: ${guerrero.puntosVida}")
        println("${mago.nombre} - Vida: ${mago.puntosVida}")
    }
}