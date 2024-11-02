package org.example.EjKotlin.GestorEstudiantes

class Estudiante(
    private val nombre: String,
    private val apellido: String,
    private val edad: Int,
    val notas: List<Float>
) {
    var curso: String? = null
    var notaFinal = 0f

    override fun toString(): String {
        return "Nombre: $nombre, Apellido: $apellido, Edad: $edad, Curso: $curso, Notas: $notas, Nota Final: $notaFinal"
    }
}