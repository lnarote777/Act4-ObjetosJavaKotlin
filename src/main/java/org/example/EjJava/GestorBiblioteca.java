package org.example.EjJava;

import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {
    public static class Biblioteca {
        List<Libro> _catalogo = new ArrayList<>();
        List<Usuario> _usuarios = new ArrayList<>();


        public void agregarLibro(Libro libro) {
            _catalogo.add(libro);
            System.out.println(libro.getTitulo() + " ha sido agregado al catálogo.");
        }

        public void registrarUsuario(Usuario usuario) {
            _usuarios.add(usuario);
            System.out.println("Usuario " + usuario.getNombre() + " ha sido registrado.");
        }


        public void prestarLibro(Libro libro, Usuario usuario) {
            if ("Disponible".equals(libro.getEstado())){
                libro.setEstado("Prestado");
                usuario.prestarLibro(libro);
                System.out.println("El libro " + libro._titulo + " se ha prestado a " + usuario._nombre);
            }else{
                System.out.println("El libro " + libro._titulo + " no está disponible, ya ha sido prestado");
            }
        }

        public void devolverLibro(Libro libro, Usuario usuario) {
            if ("Prestado".equals(libro.getEstado())){
                libro.setEstado("Disponible");
                usuario.devolverLibro(libro);
                System.out.println("El libro " + libro._titulo + " se ha prestado a " + usuario._nombre);
            }else{
                System.out.println("El libro " + libro._titulo + " no está disponible, ya ha sido prestado");
            }
        }

        public void mostrarCatalogo(){
            System.out.println("****** CATÁLOGO DE LIBROS ******");
            for (Libro libro : _catalogo) {
                System.out.println(libro);
            }
        }
    }
    public static class Libro{
        private final String _titulo;
        private final String _autor;
        private String _estado = "Disponible";

        public Libro(String titulo, String autor) {
            _titulo = titulo;
            _autor = autor;
        }

        public String getTitulo() {return _titulo;}
        public String getEstado() {return _estado;}
        public void setEstado(String estado) {
            _estado = estado;
        }

        @Override
        public String toString() {
            return "Libro: " + _titulo + " de " + _autor + "(" + getEstado()+ ")";
        }
    }
    public static class Usuario{
        private final String _nombre;
        private final List<Libro> _libros = new ArrayList<>();

        public Usuario(String nombre) {
            _nombre = nombre;
        }

        public String getNombre() {return _nombre;}

        public void prestarLibro(Libro libro) {
            _libros.add(libro);
        }

        public void devolverLibro(Libro libro) {
            _libros.remove(libro);
        }

        @Override
        public String toString() {
            return "Usuario: " + _nombre + ", Libros Prestados: " + _libros.size();
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        //Libros
        Libro libro1 = new Libro( "Bruma Roja", "Isabel");
        Libro libro2 = new Libro( "Yumi y el pintor de pesadillas", "Brandon Sanderson");
        Libro libro3 = new Libro( "Harry Poter y la piedra filosofal", "JK");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        //usuarios
        Usuario juan = new Usuario("Juan");
        Usuario ana = new Usuario("Ana");
        biblioteca.registrarUsuario(juan);
        biblioteca.registrarUsuario(ana);

        //Prestar y devolver libros
        biblioteca.prestarLibro(libro1, juan);
        biblioteca.prestarLibro(libro1, ana);

        biblioteca.devolverLibro(libro1, juan);
        biblioteca.prestarLibro(libro1, ana);

        //Catálogo
        biblioteca.mostrarCatalogo();

    }
}
