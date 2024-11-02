package org.example.EjJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReservasHotel {

    public static class Habitacion {
        private int _numero;
        private int _planta;
        private String _estado = "Libre";

        public Habitacion(int numero, int planta) {
            _numero = numero;
            _planta = planta;
        }

        public int getNumero() {return _numero;}
        public int getPlanta() {return _planta;}
        public String getEstado() {return _estado;}
        public void setEstado(String estado) {_estado = estado;}

        @Override
        public String toString() {
            return "Número=" + _numero + ", Planta=" + _planta + ", Estado=" + _estado + '}';
        }

    }

    public static class Reserva{
        private final List<Cliente> _reservas = new ArrayList<Cliente>();
        public List<Cliente> getReservas() {return _reservas;}
        public void addReserva(Cliente cliente){
            _reservas.add(cliente);
        }

        public void cancelarReserva(Cliente cliente){
            _reservas.remove(cliente);
        }

        public void mostrarReservasActivas(){
            System.out.println("****** Reservas Activas ******");
            for (Cliente reserva : _reservas){
                System.out.println(reserva);
            }
        }

    }

    public static class Cliente{
        private String _nombre;
        private String _apellido;
        private Habitacion _habitacion;
        public Cliente(String nombre, String apellido) {
            _nombre = nombre;
            _apellido = apellido;
        }

        public void reservarHabitacion(Habitacion habitacion, Reserva reserva) {
            if ("Libre".equals(habitacion.getEstado())) {
                _habitacion = habitacion;
                habitacion.setEstado("Reservada");

                reserva.addReserva(this);
                System.out.println("Habitacion reservada con exito.");
            }else{
                System.out.println("La habitación " + habitacion.getNumero() + " ya está reservada.");
            }
        }

        public void cancelarReserva(Reserva reserva) {
            if (_habitacion != null && "Reservada".equals(_habitacion.getEstado())) {
                _habitacion.setEstado("Libre");
                reserva.cancelarReserva(this);
                _habitacion = null;
                System.out.println("Reserva cancelada.");
            } else {
                System.out.println("No hay una reserva activa para cancelar.");
            }
        }

        @Override
        public String toString() {
            return "Cliente{Nombre completo=" + _nombre + " " + _apellido + ", Habitacion=" + _habitacion + '}';

        }
    }

    public static void main(String[] args) {

        Reserva reservaGeneral = new Reserva();

        Habitacion room1 = new Habitacion(17, 2);
        Habitacion room2 = new Habitacion(26, 3);

        Cliente cliente1 = new Cliente("Juan", "Ricardo");
        Cliente cliente2 = new Cliente("Antonio", "Machado");
        Cliente cliente3 = new Cliente("Francisco", "Goya");

        cliente1.reservarHabitacion(room1, reservaGeneral);
        cliente2.reservarHabitacion(room2, reservaGeneral);
        cliente3.reservarHabitacion(room1, reservaGeneral);

        cliente2.cancelarReserva(reservaGeneral);

        reservaGeneral.mostrarReservasActivas();


    }

}
