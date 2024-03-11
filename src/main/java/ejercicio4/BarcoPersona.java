package ejercicio4;

import java.util.Random;

public class BarcoPersona implements FuncionesTablero{
    Random random = new Random();

    public void colocarBarco(String tablero[][], int x, int y) throws ExcepcionColumnaFueraMatriz, ExcepcionFilaFueraMatriz {
        if(x>=tablero.length){
            throw new ExcepcionFilaFueraMatriz("eje x fuera de los limites del tablero");
        }
        if(y>=tablero.length){
            throw new ExcepcionColumnaFueraMatriz("eje y fuera de los limites del tablero");
        }
        tablero[x][y] = "barcoPersona";
    }

    public void dispararPersona(String[][] tablero, int x, int y) {
        if (tablero[x][y].equals("agua") || tablero[x][y].equals("disparoPersona")|| tablero[x][y].equals("disparoIA")){
            tablero[x][y] = "disparoPersona ";

        } else if (tablero[x][y].equals("barcoIA"))
            tablero[x][y] = "tocado y hundido";
    }

    public boolean comprobarVictoria(String[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j].equals("barcoIA")) {
                    return false;
                }
            }
        }
        System.out.println("la persona ha ganado a la maquina");
        return true;
    }


    public int ObtenerEjeX(String tablero[][]){
        int ejeX = (int) (Math.random() * tablero.length);
        return ejeX;
    }

    public int ObtenerEjeY(String tablero[][]){
        int ejeY = (int) (Math.random() * tablero.length);
        return ejeY;
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
                if (tablero[i][j].equals("barcoPersona")) {
                    tablero[i][j] = "agua";
                }
            }
        }
    }

    public String[][] NuevaPosicion(String[][] tablero){
        int x = ObtenerEjeX(tablero);
        int y = ObtenerEjeY(tablero);
        tablero[x][y] = "barcoPersona";
        return tablero;
    }


}
