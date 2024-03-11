package ejercicio1_prototype;

import java.util.Arrays;

public class Jugador extends PrototipoJugador{

    public Jugador(String nombre, int fichas, int dado, String animacion) {
        super(nombre, fichas, dado, animacion);
    }

    public Jugador(PrototipoJugador prototipoJugador) {
        super(prototipoJugador);
    }

    @Override
    public PrototipoJugador clone() {
        return new Jugador(this);
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", fichas=" + fichas +
                ", dado=" + dado +
                ", animacion='" + animacion + '\'' +
                '}';
    }
}
