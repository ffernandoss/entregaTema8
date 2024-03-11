package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dado dado = new Dado();
        PrototipoJugador jugador1 = new Jugador("Jugador1", 100, 6, "-----------------");
        PrototipoJugador jugador2 = jugador1.clone();
        jugador2.setNombre("jugador2");
        jugador2.setAnimacion("*****************");
        String otra="";
        Scanner entrada = new Scanner(System.in);

        do {
            try {
                System.out.println(jugador1.toString());
                System.out.println(jugador2.toString());

                int resultado1 = dado.lanzarDado(jugador1.getDado());
                System.out.println(resultado1);
                int resultado2 = dado.lanzarDado(jugador2.getDado());
                System.out.println(resultado2);


                dado.cambiarFichas(resultado1, resultado2, 10, 20, jugador1, jugador2);
                System.out.println(jugador1.toString());
                System.out.println(jugador2.toString());
                System.out.println("otra partida? (si/no)");

                otra = entrada.nextLine();

            } catch (ExcepcionApuestaNegativa e) {
                System.out.println(e.getMessage());
            } catch (ExcepcionApuestaMayorSaldo e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Introduce un valor valido");
                entrada.next();
            }
        } while ((jugador1.getFichas() > 0 && jugador2.getFichas() > 0) && otra.equals("si"));
    }
}

