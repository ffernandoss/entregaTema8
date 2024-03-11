import ejercicio4.*;
import org.junit.Test;

public class testEjercicio4 {

    @Test
    public void testColocarBarco() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionColumnaFueraMatriz, ExcepcionFilaFueraMatriz{
        Tablero ft = new Tablero();
        BarcoPersona bp = new BarcoPersona();
        BarcoIA bia = new BarcoIA();
        String tablero[][]=ft.crearTablero(2, 2);
        bp.colocarBarco(tablero, 0, 0);
        bia.ColocarBarcoIA(tablero);
        ft.mostrarTablero(tablero);
    }
    @Test
    public void testColocarBarco2() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionColumnaFueraMatriz, ExcepcionFilaFueraMatriz{
        Tablero ft = new Tablero();
        BarcoPersona bp = new BarcoPersona();
        BarcoIA bia = new BarcoIA();
        String tablero[][]=ft.crearTablero(3, 3);
        bp.colocarBarco(tablero, 0, 2);
        bia.ColocarBarcoIA(tablero);
        ft.mostrarTablero(tablero);
    }

    @Test
    public void DispararBarcoIA() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionColumnaFueraMatriz, ExcepcionFilaFueraMatriz{
        Tablero ft = new Tablero();
        BarcoPersona bp = new BarcoPersona();
        BarcoIA bia = new BarcoIA();
        String tablero[][]=ft.crearTablero(2, 2);
        bp.colocarBarco(tablero, 0, 1);
        bia.ColocarBarcoIA(tablero);
        ft.mostrarTablero(tablero);
        bia.DispararIA(tablero);
        ft.mostrarTablero(tablero);
    }
    @Test
    public void DispararBarcoPersona() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionColumnaFueraMatriz, ExcepcionFilaFueraMatriz{
        Tablero ft = new Tablero();
        BarcoPersona bp = new BarcoPersona();
        BarcoIA bia = new BarcoIA();

        String tablero[][]=ft.crearTablero(2, 2);
        bp.colocarBarco(tablero, 0, 1);
        bia.ColocarBarcoIA(tablero);
        ft.mostrarTablero(tablero);
        bp.dispararPersona(tablero, 1, 1);
        ft.mostrarTablero(tablero);
    }

    @Test
    public void TestTodoJuntoMain() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionColumnaFueraMatriz, ExcepcionFilaFueraMatriz{
        Tablero ft = new Tablero();
        BarcoPersona bp = new BarcoPersona();
        BarcoIA bia = new BarcoIA();
        String tablero[][]=ft.crearTablero(2, 2);
        bp.colocarBarco(tablero, 0, 1);
        bia.ColocarBarcoIA(tablero);
        ft.mostrarTablero(tablero);
        bp.dispararPersona(tablero, 1, 1);
        ft.mostrarTablero(tablero);
        bia.DispararIA(tablero);
        ft.mostrarTablero(tablero);
    }

    @Test
    public void TestTodoJuntoMain2() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionColumnaFueraMatriz, ExcepcionFilaFueraMatriz {
        Tablero ft = new Tablero();
        BarcoPersona bp = new BarcoPersona();
        BarcoIA bia = new BarcoIA();

        String tablero[][]=ft.crearTablero(2, 2);
        bp.colocarBarco(tablero, 0, 1);

        bia.ColocarBarcoIA(tablero);
        ft.mostrarTablero(tablero);
        bp.dispararPersona(tablero, 1, 1);
        System.out.println("comprobacion persona");
        bp.comprobarVictoria(tablero);
        ft.mostrarTablero(tablero);
        bia.DispararIA(tablero);
        System.out.println("comprobacion IA");
        bia.comprobarVictoria(tablero);
        ft.mostrarTablero(tablero);

    }
    @Test
    public void comprobarCambiosPosicionBarcoPersona()throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionColumnaFueraMatriz, ExcepcionFilaFueraMatriz{
        Tablero ft = new Tablero();
        BarcoPersona bp = new BarcoPersona();
        String tablero[][]=ft.crearTablero(2, 2);
        bp.colocarBarco(tablero, 0, 1);
        ft.mostrarTablero(tablero);
        bp.CondicionesClimaticas(tablero);
        ft.mostrarTablero(tablero);

    }

    @Test
    public void comprobarCambioPosicionIA()throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionColumnaFueraMatriz, ExcepcionFilaFueraMatriz{
        Tablero ft = new Tablero();
        BarcoIA bia = new BarcoIA();
        String tablero[][]=ft.crearTablero(2, 2);
        bia.ColocarBarcoIA(tablero);
        ft.mostrarTablero(tablero);
        bia.CondicionesClimaticas(tablero);
        ft.mostrarTablero(tablero);

    }




}
