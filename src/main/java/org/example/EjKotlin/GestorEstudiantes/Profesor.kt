package org.example.EjKotlin.GestorEstudiantes



class Profesor(private val nombre: String, private val apellido: String) {
    fun asignarCursoAEstudiante(curso:Curso, estudiante:Estudiante) {
        estudiante.curso = curso.nombre
        curso.estudiantes.add(estudiante)
    }

    fun calcularNota(estudiante:Estudiante) {
        var suma = 0f
        for (nota in estudiante.notas) {
            suma += nota
        }
        estudiante.notaFinal = suma / estudiante.notas.size
    }
}