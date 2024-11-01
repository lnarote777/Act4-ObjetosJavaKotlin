package org.example.EjJava;

import java.util.*;

public class GestionEstudiantes {
    public static class Estudiante{
        private String _nombre;
        private String _apellido;
        private int _edad;
        private String _curso;
        private List<Float> _notas;
        private float _notaFinal;

        public Estudiante(String nombre, String apellido, int edad, List<Float> notas) {
            _nombre = nombre;
            _apellido = apellido;
            _edad = edad;
            _notas = notas;

        }

        @Override
        public String toString() {
            return "Nombre: " + _nombre + ", Apellido: " + _apellido + ", Edad: " + _edad + ", Curso: " + _curso + ", Notas: " + _notas + ", Nota Final: " + _notaFinal;
        }
    }

    public static class Curso {
        private final String _nombre;
        private List<Estudiante> _estudiantes;

        public Curso(String nombre) {
            _nombre = nombre;
           _estudiantes = new ArrayList<Estudiante>();
        }

    }

    public static class Profesor{
        private String _nombre;
        private String _apellido;

        public Profesor(String nombre, String apellido) {
            _nombre = nombre;
            _apellido = apellido;
        }

        public void asignarCursoAEstudiante(Curso curso, Estudiante estudiante) {
            estudiante._curso = curso._nombre;
            curso._estudiantes.add(estudiante);
        }

        public void calcularNota(Estudiante estudiante){
            float suma = 0;
            for (float nota : estudiante._notas){
                suma += nota;
            }
            estudiante._notaFinal = suma / estudiante._notas.size();
        }

    }

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Federico", "García");

        Estudiante [] estudiantes = {
                new Estudiante("Raúl", "Muñoz", 18, List.of(8.4f, 9.18f, 7.2f, 7f)),
                new Estudiante("Derek", "Trujillo", 20, List.of(4.5f, 8.4f, 3.35f,5f)),
                new Estudiante("Juan", "Gomez", 18, List.of(6.7f, 8.4f, 3.35f,5f)),
                new Estudiante("Maria", "Torres", 21, List.of(7f, 8.79f, 9f,9.5f))};

        Curso curso = new Curso("2ºDAM");

        for (Estudiante estudiante : estudiantes) {
            profesor.asignarCursoAEstudiante(curso, estudiante);
            profesor.calcularNota(estudiante);

            System.out.println(estudiante);
        }




    }
}
