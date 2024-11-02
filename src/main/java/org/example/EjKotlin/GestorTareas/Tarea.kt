package org.example.EjKotlin.GestorTareas

class Tarea(val nombre: String, private val descripcion: String) {
    var estado = "Pendiente"

    override fun toString(): String {
        return "Tarea: $nombre -> $descripcion ($estado)"
    }
}