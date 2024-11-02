package org.example.EjKotlin.ReservasHotel


fun main() {
    val reservaGeneral = Reserva()

    val room1 = Habitacion(17, 2)
    val room2 = Habitacion(26, 3)

    val cliente1 = Cliente("Juan", "Ricardo")
    val cliente2 = Cliente("Antonio", "Machado")
    val cliente3 = Cliente("Francisco", "Goya")

    cliente1.reservarHabitacion(room1, reservaGeneral)
    cliente2.reservarHabitacion(room2, reservaGeneral)
    cliente3.reservarHabitacion(room1, reservaGeneral)

    cliente2.cancelarReserva(reservaGeneral)

    reservaGeneral.mostrarReservasActivas()
}