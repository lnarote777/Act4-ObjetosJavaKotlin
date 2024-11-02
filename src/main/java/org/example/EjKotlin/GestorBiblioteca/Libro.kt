package org.example.EjKotlin.GestorBiblioteca

class Libro(val titulo: String, val autor: String) {
    var estado: String = "Disponible"

    override fun toString(): String {
        return "Libro: $titulo de $autor($estado)"
    }
}