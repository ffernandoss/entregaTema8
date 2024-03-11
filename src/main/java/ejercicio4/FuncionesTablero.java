package ejercicio4;


public interface FuncionesTablero {


    public int ObtenerEjeX(String tablero[][]);

     int ObtenerEjeY(String tablero[][]);

     boolean comprobarVictoria(String[][] tablero);

     void CondicionesClimaticas(String[][] tablero);


     void resetearPosicion(String[][] tablero);

     String[][] NuevaPosicion(String[][] tablero);







}
