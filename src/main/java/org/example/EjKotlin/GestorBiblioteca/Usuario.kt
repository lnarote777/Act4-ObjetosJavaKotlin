package org.example.EjKotlin.GestorBiblioteca

class Usuario(val nombre: String) {
    private val libros: MutableList<Libro> = ArrayList()

    fun prestarLibro(libro: Libro) {
        libros.add(libro)
    }

    fun devolverLibro(libro:Libro) {
        libros.remove(libro)
    }

    override fun toString(): String {
        return "Usuario: $nombre, Libros Prestados: ${libros.size}"
    }
}
