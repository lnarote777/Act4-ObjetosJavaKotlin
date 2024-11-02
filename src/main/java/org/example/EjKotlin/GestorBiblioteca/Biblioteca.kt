package org.example.EjKotlin.GestorBiblioteca


class Biblioteca {
    val catalogo= mutableListOf<Libro>()
    val usuarios= mutableListOf<Usuario>()


    fun agregarLibro(libro: Libro) {
        catalogo.add(libro)
        println("${ libro.titulo } ha sido agregado al catálogo.")
    }

    fun registrarUsuario(usuario: Usuario) {
        usuarios.add(usuario)
        println("Usuario  ${usuario.nombre} ha sido registrado.")
    }


    fun prestarLibro(libro: Libro, usuario: Usuario) {
        if ("Disponible" == libro.estado) {
            libro.estado = "Prestado"
            usuario.prestarLibro(libro)
            println("El libro ${libro.titulo} se ha prestado a ${usuario.nombre}")
        } else {
            println("El libro ${libro.titulo} no está disponible, ya ha sido prestado")
        }
    }

    fun devolverLibro(libro: Libro, usuario: Usuario) {
        if ("Prestado" == libro.estado) {
            libro.estado = "Disponible"
            usuario.devolverLibro(libro)
            println("${usuario.nombre} ha devuelto el libro  ${libro.titulo}")
        } else {
            println("El libro ${libro.titulo} no habia sido prestado")
        }
    }

    fun mostrarCatalogo() {
        println("****** CATÁLOGO DE LIBROS ******")
        catalogo.forEach { println(it) }
    }
}