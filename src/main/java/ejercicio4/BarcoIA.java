package ejercicio4;

import java.util.Random;

public class BarcoIA implements FuncionesTablero{

Random random = new Random();

    public void ColocarBarcoIA(String tablero[][]) {
        int ejeX = ObtenerEjeX(tablero);
        int ejeY = ObtenerEjeY(tablero);

        if (tablero[ejeX][ejeY] == "barcoPersona") {
            ColocarBarcoIA(tablero);
        } else {
            tablero[ejeX][ejeY] = "barcoIA";
        }
    }


    public void DispararIA(String tablero[][]) {
        int ejeX, ejeY;
        String disparo;

        ejeX = ObtenerEjeX(tablero);
        ejeY = ObtenerEjeY(tablero);
        disparo = tablero[ejeX][ejeY];

        if (disparo.equals("agua")) {
            tablero[ejeX][ejeY] = "disparoIA";
        } else if (disparo.equals("barcoPersona")) {
            tablero[ejeX][ejeY] = "tocado y hundido,el rival gana";
        }
        else DispararIA(tablero);

    }
    public boolean comprobarVictoria(String[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals("barcoPersona")) {
                    return false;
                }
            }
        }
        System.out.println("la maquina ha ganado a la persona");
        return true;
    }



    public int ObtenerEjeY(String tablero[][]){
        int ejeY = (int) (Math.random() * tablero.length);
        return ejeY;
    }
    public int ObtenerEjeX(String tablero[][]){
        int ejeX = (int) (Math.random() * tablero.length);
        return ejeX;
    }

    public void CondicionesClimaticas(String[][] tablero){
        int numero = random.nextInt(2);

        if(numero == 1) {
            System.out.println("el clima ha hecho que el barco se mueva de posicion");
            resetearPosicion(tablero);
            NuevaPosicion(tablero);
        }
        else System.out.println("clima en calma");

    }

    public void resetearPosicion(String[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals("barcoIA")) {
                    tablero[i][j] = "agua";
                }
            }
        }
    }

    public String[][] NuevaPosicion(String[][] tablero){
        int x = ObtenerEjeX(tablero);
        int y = ObtenerEjeY(tablero);
        tablero[x][y] = "barcoIA";
        return tablero;
    }




}
