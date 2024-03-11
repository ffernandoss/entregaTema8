package ejercicio4;

public class Tablero {
    public String[][] crearTablero(int x, int y)throws ExcepcionFila0oNegativa, ExcepcionColumna0oNegativa {
        if (x <= 0) {
            throw new ExcepcionFila0oNegativa("El numero de filas no puede ser 0 o menos");
        }
        if (y <= 0) {
            throw new ExcepcionColumna0oNegativa("El numero de columnas no puede ser 0 o menos");
        }else {
            String[][] tablero = new String[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    tablero[i][j] = "agua";
                }
            }
            return tablero;
        }
    }

    public void mostrarTablero(String tablero[][]) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("|"+tablero[i][j]);
            }
            System.out.println("|");
        }
    }

}
