package org.example.EjKotlin.GestorTareas


class Usuario(val nombre: String, private val password: String) {
    val tareas =  mutableListOf<Tarea>()
    private val proyectos = mutableListOf<Proyecto>()
    fun crearProyecto() {
        print("Nombre del proyecto: ")
        val nombre = readln()

        print("Descripcion del proyecto: ")
        val descripcion = readln()

        val proyecto = Proyecto(nombre, descripcion)
        proyectos.add(proyecto)
    }

    fun crearTareas() {
        print("Nueva tarea: ")
        val nombre = readln()

        print("Descripción: ")
        val descripcion = readln()

        val tarea = Tarea(nombre, descripcion)
        tareas.add(tarea)
    }

    fun completarTarea(nombre: String) {
        for (tarea in tareas) {
            if (tarea.nombre == nombre) {
                tarea.estado = "Completada"
            }
        }
    }
}