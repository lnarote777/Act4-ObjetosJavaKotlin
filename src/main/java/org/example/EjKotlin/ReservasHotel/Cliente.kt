package org.example.EjKotlin.ReservasHotel

class Cliente(private val nombre: String, private val apellido: String) {
    private var habitacion: Habitacion? = null

    fun reservarHabitacion(habitacion: Habitacion, reserva: Reserva) {
        if ("Libre" == habitacion.estado) {
            this.habitacion = habitacion
            habitacion.estado = "Reservada"

            reserva.addReserva(this)
            println("Habitacion reservada con exito.")
        } else {
            println("La habitación ${habitacion.numero} ya está reservada.")
        }
    }

    fun cancelarReserva(reserva:Reserva) {
        if (habitacion != null && "Reservada" == habitacion!!.estado) {
            habitacion!!.estado = "Libre"
            reserva.cancelarReserva(this)
            habitacion = null
            println("Reserva cancelada.")
        } else {
            println("No hay una reserva activa para cancelar.")
        }
    }

    override fun toString(): String {
        return "Cliente{Nombre completo=$nombre $apellido, Habitacion $habitacion}"
    }
}