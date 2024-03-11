package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Tablero tableroComun = new Tablero();
        BarcoIA barcoIA = new BarcoIA();
        BarcoPersona barcoPersona = new BarcoPersona();
        Scanner entrada = new Scanner(System.in);
        boolean personaGana = false;
        boolean IAgana = false;
        try {
            System.out.println("Introduce el tamaño del eje x del tablero");
            int TableroX = entrada.nextInt();

            System.out.println("Introduce el tamaño del eje y del tablero");
            int TableroY = entrada.nextInt();

            String[][] tablero = tableroComun.crearTablero(TableroX, TableroY);
            System.out.println("TABLERO VACIO");
            tableroComun.mostrarTablero(tablero);

            System.out.println("Introduce la posicion x del barco");
            int BarcoX = entrada.nextInt();

            System.out.println("Introduce la posicion y del barco");
            int BarcoY = entrada.nextInt();

            System.out.println("TABLERO CON BARCO USUARIO");
            barcoPersona.colocarBarco(tablero, BarcoX, BarcoY);
            barcoPersona.CondicionesClimaticas(tablero);
            tableroComun.mostrarTablero(tablero);

            System.out.println("TABLERO CON BARCO IA");
            barcoIA.ColocarBarcoIA(tablero);
            barcoPersona.CondicionesClimaticas(tablero);
            tableroComun.mostrarTablero(tablero);

            do {
                System.out.println("si disparas a un lugar donde ya hayas disparado o donde haya disparado la maquina, seguirá apareciendo lo que estaba antes");
                System.out.println("dime el eje x donde quieres disparar");
                int disparoX = entrada.nextInt();

                System.out.println("dime el eje y donde quieres disparar");
                int disparoY = entrada.nextInt();


                System.out.println("TABLERO CON DISPARO USUARIO Y COMPROBACION VICTORIA");
                barcoPersona.dispararPersona(tablero, disparoX, disparoY);
                tableroComun.mostrarTablero(tablero);
                personaGana = barcoPersona.comprobarVictoria(tablero);


                if (personaGana == false) {
                    System.out.println("TABLERO CON DISPARO IA Y COMPROBACION VICTORIA IA");
                    barcoIA.DispararIA(tablero);
                    tableroComun.mostrarTablero(tablero);
                    IAgana = barcoIA.comprobarVictoria(tablero);
                }
            } while (personaGana == false && IAgana == false);
        }catch (ExcepcionFila0oNegativa e){
            System.out.println(e.getMessage());
        }catch (ExcepcionColumna0oNegativa e){
            System.out.println(e.getMessage());
        }catch (ExcepcionFilaFueraMatriz e){
            System.out.println(e.getMessage());
        }catch (ExcepcionColumnaFueraMatriz e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("tipo de dato incorrecto");
        }catch (StackOverflowError e) {
            System.out.println("error de desbordamiento");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("te has ido fuera de limites");
        }
    }
}
