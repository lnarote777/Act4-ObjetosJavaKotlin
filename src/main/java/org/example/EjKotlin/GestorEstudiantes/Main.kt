package org.example.EjKotlin.GestorEstudiantes

fun main() {
    val profesor = Profesor("Federico", "García")

    val estudiantes = listOf(
        Estudiante("Raúl", "Muñoz", 18, listOf(8.4f, 9.18f, 7.2f, 7f)),
        Estudiante("Derek", "Trujillo", 20, listOf(4.5f, 8.4f, 3.35f, 5f)),
        Estudiante("Juan", "Gomez", 18, listOf(6.7f, 8.4f, 3.35f, 5f)),
        Estudiante("Maria", "Torres", 21, listOf(7f, 8.79f, 9f, 9.5f))
    )

    val curso = Curso("2ºDAM")

    for (estudiante in estudiantes) {
        profesor.asignarCursoAEstudiante(curso, estudiante)
        profesor.calcularNota(estudiante)

        println(estudiante)
    }
}