package org.example.EjKotlin.ReservasHotel

class Reserva {
    private val reservas = mutableListOf<Cliente>()

    fun addReserva(cliente: Cliente) {
        reservas.add(cliente)
    }

    fun cancelarReserva(cliente: Cliente) {
        reservas.remove(cliente)
    }

    fun mostrarReservasActivas() {
        println("****** Reservas Activas ******")
        for (reserva in reservas) {
            println(reserva)
        }
    }
}