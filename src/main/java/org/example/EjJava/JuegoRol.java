package org.example.EjJava;

public class JuegoRol {
    public static class Personaje{
        protected String _nombre;
        protected int _puntosVida;
        public Personaje(String nombre, int vidaMax) {
            _nombre = nombre;
            _puntosVida = vidaMax;
        }

        public String getNombre() {return _nombre;}
        public int getPuntosVida() {return _puntosVida;}
        public boolean estaVivo(){return _puntosVida > 0;}

        public void recibirDanio(int danio){
            _puntosVida -= danio;
            System.out.println(_nombre + " recibió " + danio + " de daño. Vida restante: " + _puntosVida);
        }
    }

    public static class Guerrero extends Personaje{
        public Guerrero(String nombre, int vidaMax) {
            super(nombre, vidaMax);
        }

        public void atacar(Personaje enemigo){
            System.out.println(getNombre() + " ataca a " + enemigo._nombre + " causando 10 de daño.");
            enemigo.recibirDanio(10);
        }
    }

    public static class Mago extends Personaje{
        public Mago(String nombre, int vidaMax) {
            super(nombre, vidaMax);
        }

        public void lanzarHechizo(Personaje enemigo, Hechizo hechizo){
            System.out.println(getNombre() + " lanza " + hechizo.getNombre() + " causando " + hechizo.getDanio() + " de daño.");
            enemigo.recibirDanio(hechizo.getDanio());
        }
    }

    public static class Hechizo {
        private String _nombre;
        private int _danio;

        public Hechizo(String nombre, int danio) {
            _nombre = nombre;
            _danio = danio;
        }

        public String getNombre() {return _nombre;}
        public int getDanio() {return _danio;}
    }

    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Thor", 50);
        Mago mago = new Mago("Merlín", 40);
        Hechizo bolaDeFuego = new Hechizo("Bola de Fuego", 15);

        // Simulación de combate
        guerrero.atacar(mago);
        mago.lanzarHechizo(guerrero, bolaDeFuego);

        // Estado final
        System.out.println(guerrero.getNombre() + " - Vida: " + guerrero.getPuntosVida());
        System.out.println(mago.getNombre() + " - Vida: " + mago.getPuntosVida());
    }
}
