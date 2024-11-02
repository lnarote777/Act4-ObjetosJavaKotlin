package org.example.EjKotlin.GestorTareas

fun main() {
    val usuario = Usuario("Juan", "123456")

    usuario.crearTareas()
    usuario.crearTareas()

    usuario.crearProyecto()

    println("Nombre de la tarea completada: ")
    val nombre = readln()
    usuario.completarTarea(nombre)

    for (tarea in usuario.tareas) {
        println(tarea)
    }
}