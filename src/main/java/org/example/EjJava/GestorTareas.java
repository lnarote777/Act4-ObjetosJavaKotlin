package org.example.EjJava;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorTareas {
    public static class Tarea{

        private String _nombre;
        private String _descripcion;
        private String _estado = "Pendiente";

        public Tarea(String nombre, String descripcion) {
            _nombre = nombre;
            _descripcion = descripcion;
        }

        @Override
        public String toString() {
            return "Tarea: " + _nombre + " -> " + _descripcion + " (" + _estado + ")";
        }
    }

    public static class Proyecto{
        private String _nombre;
        private String _descripcion;

        public Proyecto(String nombre, String descripcion) {
            _nombre = nombre;
            _descripcion = descripcion;
        }
    }

    public static class Usuario{

        private String _nombre;
        private String _password;
        private List<Tarea> _tareas = new ArrayList<Tarea>();
        private List<Proyecto> _proyectos = new ArrayList<Proyecto>();
        public Usuario(String nombre, String password) {}

        public void crearProyecto(){
            Scanner sc = new Scanner(System.in);

            System.out.print("Nombre del proyecto: ");
            String nombre = sc.nextLine();

            System.out.print("Descripcion del proyecto: ");
            String descripcion = sc.nextLine();

            Proyecto proyecto = new Proyecto(nombre, descripcion);
            _proyectos.add(proyecto);
        }

        public void crearTareas(){
            Scanner sc = new Scanner(System.in);

            System.out.print("Nueva tarea: ");
            String nombre = sc.nextLine();

            System.out.print("Descripción: ");
            String descripcion = sc.nextLine();

            Tarea tarea = new Tarea(nombre, descripcion);
            _tareas.add(tarea);
        }

        public void completarTarea(String nombre){
            for (Tarea tarea : _tareas) {
                if (tarea._nombre.equals(nombre)) {
                    tarea._estado = "Completada";
                }
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario("Juan", "123456");

        usuario.crearTareas();
        usuario.crearTareas();

        usuario.crearProyecto();

        System.out.println("Nombre de la tarea completada: ");
        String nombre = sc.nextLine();
        usuario.completarTarea(nombre);

        for (Tarea tarea : usuario._tareas){
            System.out.println(tarea);
        }


    }
}
