package ejercicio3;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ganar=0;
        Scanner entrada =new Scanner(System.in);
        FuncionesTablero funcionesTablero = new FuncionesTablero();

        System.out.println("introduce el tamaño del eje x del tablero");
        int ejeX=entrada.nextInt();

        System.out.println("introduce el tamaño del eje y del tablero");
        int ejeY=entrada.nextInt();

        try {

            String[][] tablero = funcionesTablero.crearTablero(ejeX, ejeY);
        funcionesTablero.dondeVaBarco(tablero);


do {

    funcionesTablero.mostrarTablero(tablero);


    System.out.println("en que ejex quieres disparar");
    int disparoX = entrada.nextInt();

    System.out.println("en que eje y quieres disparar");
    int disparoY = entrada.nextInt();

    funcionesTablero.dispararPersona(tablero, disparoX, disparoY);
    funcionesTablero.recomendarDisparo(tablero);
     ganar = funcionesTablero.comprobarVictoriaPersona(tablero);
}while (!(ganar ==2));
        }catch (ExcepcionFila0oNegativa e){
        System.out.println(e.getMessage());
        }catch (ExcepcionColumna0oNegativa e) {
            System.out.println(e.getMessage());
        }catch (ExcepcionTamañoMinimoMatriz e){
            System.out.println(e.getMessage());

        }catch (ExcepcionDisparoFueraMatriz e) {
            System.out.println(e.getMessage());
        }catch (ExcepcionDisparoNegativo e){
                System.out.println(e.getMessage());

        }catch (InputMismatchException e){
        System.out.println("Introduce un numero");
    }
    }
}