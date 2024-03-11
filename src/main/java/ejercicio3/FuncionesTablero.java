package ejercicio3;

public class FuncionesTablero {
    public String[][] crearTablero(int x, int y)throws ExcepcionFila0oNegativa, ExcepcionColumna0oNegativa,ExcepcionTamañoMinimoMatriz {
        if (x < 2 || y < 2) {
            throw new ExcepcionTamañoMinimoMatriz("El tamaño minimo de la matriz es 2x2");
        }
            if (x <= 0) {
                throw new ExcepcionFila0oNegativa("El numero de filas no puede ser 0 o menos");
            }
            if (y <= 0) {
                throw new ExcepcionColumna0oNegativa("El numero de columnas no puede ser 0 o menos");

            } else {
                String[][] tablero = new String[x][y];
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        tablero[i][j] = "agua";
                    }
                }
                return tablero;
            }
        }

        public int ObtenerEjeX (String tablero[][]){
            int ejeX = (int) (Math.random() * tablero.length);
            return ejeX;
        }

        public int ObtenerEjeY (String tablero[][]){
            int ejeY = (int) (Math.random() * tablero.length);
            return ejeY;
        }

        public void colocarBarcoIAHorizontal (String tablero[][]){
            int ejeX = ObtenerEjeX(tablero);
            int ejeY = (int) (Math.random() * (tablero[0].length - 1));


            tablero[ejeX][ejeY] = "barcoIA";
            tablero[ejeX][ejeY + 1] = "barcoIA";
        }

        public void colocarBarcoIAVertical (String tablero[][]){
            int ejeX = (int) (Math.random() * (tablero.length - 1));
            int ejeY = ObtenerEjeY(tablero);

            tablero[ejeX][ejeY] = "barcoIA";
            tablero[ejeX + 1][ejeY] = "barcoIA";
        }

        public void dondeVaBarco (String tablero[][]){
            int eje = (int) (Math.random() * 2);
            if (eje == 1) {
                colocarBarcoIAHorizontal(tablero);
            } else {
                colocarBarcoIAVertical(tablero);
            }
        }

        public void dispararPersona (String[][]tablero,int x, int y) throws
        ExcepcionDisparoFueraMatriz, ExcepcionDisparoNegativo {
            if (x < 0 || y < 0) {
                throw new ExcepcionDisparoNegativo("El disparo no puede ser negativo");
            }
            if (x >= tablero.length || y >= tablero.length) {
                throw new ExcepcionDisparoFueraMatriz("El disparo no puede ser mayor que el tamaño del tablero");
            }else {
                boolean disparo = condicionesMaritimas();
                if (disparo == true) {
                    System.out.println("debido al oleaje, el disparo se ha desviado y se ha ido hasta del tablero");
                }
                if (disparo == false) {
                    if (tablero[x][y].equals("barcoIA")) {
                        tablero[x][y] = "tocado";
                    } else {
                        tablero[x][y] = "disparoFallido";
                    }
                }
            }
        }

        public boolean condicionesMaritimas () {
            int numero = (int) (Math.random() * 2);
            if (numero == 1) {
                System.out.println("muchas olas");
                return true;
            }
            if (numero == 0)
                System.out.println("olas en calma");
            return false;


        }

        public int comprobarVictoriaPersona (String[][]tablero){
            int contadorTocados = 0;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j].equals("tocado")) {
                        contadorTocados++;
                    }
                }
            }
            if (contadorTocados == 2) {
                System.out.println("has hundido la totalidad del barco");
                return 2;
            }
            if (contadorTocados == 1) {
                System.out.println("todavia falta que le des un ultimo toque");
                return 1;
            }
            if (contadorTocados == 0)
                System.out.println("de momento no le has ni tocado");
            return 0;

        }

        public void recomendarDisparo (String[][]tablero){
            int tocados = comprobarVictoriaPersona(tablero);
            if (tocados == 0) {
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        if (tablero[i][j].equals("agua") || tablero[i][j].equals("barcoIA")) {
                            System.out.println("recomendacion: " + i + " " + j + "\n");
                        }
                    }
                }
            }
            if (tocados == 1) {
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        if (tablero[i][j].equals("tocado")) {
                            if (i > 0 && !tablero[i - 1][j].equals("tocado") && !tablero[i - 1][j].equals("disparoFallido")) {
                                System.out.println("Recomendacion - Arriba: " + (i - 1) + " " + j);
                            }
                            if (j > 0 && !tablero[i][j - 1].equals("tocado") && !tablero[i][j - 1].equals("disparoFallido")) {
                                System.out.println("Recomendacion - Izquierda: " + i + " " + (j - 1));
                            }
                            if (i < tablero.length - 1 && !tablero[i + 1][j].equals("tocado") && !tablero[i + 1][j].equals("disparoFallido")) {
                                System.out.println("Recomendacion - Abajo: " + (i + 1) + " " + j);
                            }
                            if (j < tablero[i].length - 1 && !tablero[i][j + 1].equals("tocado") && !tablero[i][j + 1].equals("disparoFallido")) {
                                System.out.println("Recomendacion - Derecha: " + i + " " + (j + 1));
                            }
                        }
                    }
                }
            }
            if (tocados == 2) {
                System.out.println("no hay recomendacion ya que has dado a las 2 posiciones del barco");
            }
        }


        public void mostrarTablero (String tablero[][]){

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
        }


    }
