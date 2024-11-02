package org.example.EjKotlin.GestorBiblioteca

fun main() {
    val biblioteca = Biblioteca()

    //Libros
    val libro1 = Libro("Bruma Roja", "Isabel")
    val libro2 = Libro("Yumi y el pintor de pesadillas", "Brandon Sanderson")
    val libro3 = Libro("Harry Poter y la piedra filosofal", "JK")
    biblioteca.agregarLibro(libro1)
    biblioteca.agregarLibro(libro2)
    biblioteca.agregarLibro(libro3)

    //usuarios
    val juan = Usuario("Juan")
    val ana = Usuario("Ana")
    biblioteca.registrarUsuario(juan)
    biblioteca.registrarUsuario(ana)

    //Prestar y devolver libros
    biblioteca.prestarLibro(libro1, juan)
    biblioteca.prestarLibro(libro1, ana)

    biblioteca.devolverLibro(libro1, juan)
    biblioteca.prestarLibro(libro1, ana)

    //Catálogo
    biblioteca.mostrarCatalogo()
}