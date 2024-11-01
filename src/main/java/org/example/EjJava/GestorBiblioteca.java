package org.example.EjJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GestorBiblioteca {
    public static class Biblioteca {
        public void prestarLibro(Libro libro, Usuario usuario) {
            if (Objects.equals(libro._estado, "Disponible")){
                libro._estado = "Prestado";
                usuario._libros.add(libro);
                System.out.println("El libro " + libro._titulo + " se ha prestado a " + usuario._nombre);
            }else{
                System.out.println("El libro " + libro._titulo + " no está disponible, ya ha sido prestado");
            }
        }
    }
    public static class Libro{
        private String _titulo;
        private String _autor;
        private int _publicacion;
        private String _estado = "Disponible";

        public Libro(String titulo, String autor, int publicacion) {
            _titulo = titulo;
            _autor = autor;
            _publicacion = publicacion;
        }
    }
    public static class Usuario{
        private String _nombre;
        private List<Libro> _libros = new ArrayList<>();

        public Usuario(String nombre) {
            _nombre = nombre;
        }
    }

    public static void main(String[] args) {
        //Libros
        Libro libro1 = new Libro( "Bruma Roja", "Isabel", 2023);
        Libro libro2 = new Libro( "Yumi y el pintor de pesadillas", "Brandon Sanderson", 2022);
        Libro libro3 = new Libro( "Harry Poter y la piedra filosofal", "JK", 1990);

        //usuarios
        Usuario juan = new Usuario("Juan");
        Usuario ana = new Usuario("Ana");
        Usuario antonio = new Usuario("Antonio");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.prestarLibro(libro1, juan);
        biblioteca.prestarLibro(libro2, juan);
        biblioteca.prestarLibro(libro3, ana);
        biblioteca.prestarLibro(libro1, antonio);

    }
}
