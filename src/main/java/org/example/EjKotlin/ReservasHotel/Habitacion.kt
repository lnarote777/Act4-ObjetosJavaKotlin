package org.example.EjKotlin.ReservasHotel

class Habitacion(val numero: Int, val planta: Int) {
    var estado: String = "Libre"

    override fun toString(): String {
        return "Número=$numero, Planta=$planta, Estado=$estado}"
    }
}