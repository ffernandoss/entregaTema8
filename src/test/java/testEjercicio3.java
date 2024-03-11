import ejercicio3.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testEjercicio3 {

    @Test
    public void testBarcoHorizontal() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionTamañoMinimoMatriz{
        FuncionesTablero funcionesTablero = new FuncionesTablero();
        String[][] tablero = funcionesTablero.crearTablero(2, 3);
        funcionesTablero.colocarBarcoIAHorizontal(tablero);
        funcionesTablero.mostrarTablero(tablero);

    }
    @Test
    public void testDonvaBarco() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionTamañoMinimoMatriz{
        FuncionesTablero funcionesTablero = new FuncionesTablero();
        String[][] tablero = funcionesTablero.crearTablero(2, 2);
        funcionesTablero.dondeVaBarco(tablero);
        funcionesTablero.mostrarTablero(tablero);

    }
    @Test
    public void testBarcoIAVertical() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionTamañoMinimoMatriz{
        FuncionesTablero funcionesTablero = new FuncionesTablero();
        String[][] tablero = funcionesTablero.crearTablero(2, 2);
        funcionesTablero.colocarBarcoIAVertical(tablero);
        funcionesTablero.mostrarTablero(tablero);

    }

    @Test
    public void testDisparar() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionDisparoFueraMatriz,ExcepcionDisparoNegativo, ExcepcionTamañoMinimoMatriz{
        FuncionesTablero funcionesTablero = new FuncionesTablero();
        String[][] tablero = funcionesTablero.crearTablero(2, 2);
        funcionesTablero.dondeVaBarco(tablero);
        funcionesTablero.dispararPersona(tablero, 1, 1);
        funcionesTablero.mostrarTablero(tablero);
    }
    @Test
    public void testDisparar2() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionDisparoFueraMatriz,ExcepcionDisparoNegativo, ExcepcionTamañoMinimoMatriz{
        FuncionesTablero funcionesTablero = new FuncionesTablero();
        String[][] tablero = funcionesTablero.crearTablero(7, 2);
        funcionesTablero.dondeVaBarco(tablero);
        funcionesTablero.dispararPersona(tablero, 1, 1);
        funcionesTablero.dispararPersona(tablero, 1, 0);
        funcionesTablero.mostrarTablero(tablero);
        funcionesTablero.comprobarVictoriaPersona(tablero);
    }
    @Test
    public void testDisparar3() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionDisparoFueraMatriz,ExcepcionDisparoNegativo, ExcepcionTamañoMinimoMatriz{
        FuncionesTablero funcionesTablero = new FuncionesTablero();
        String[][] tablero = funcionesTablero.crearTablero(2, 2);
        funcionesTablero.dondeVaBarco(tablero);
        funcionesTablero.dispararPersona(tablero, 1, 1);
        funcionesTablero.dispararPersona(tablero, 1, 0);
        funcionesTablero.mostrarTablero(tablero);
        funcionesTablero.comprobarVictoriaPersona(tablero);
    }
    @Test
    public void testDisparar4() throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionDisparoFueraMatriz,ExcepcionDisparoNegativo, ExcepcionTamañoMinimoMatriz{
        FuncionesTablero funcionesTablero = new FuncionesTablero();
        String[][] tablero = funcionesTablero.crearTablero(2, 2);
        funcionesTablero.dondeVaBarco(tablero);
        funcionesTablero.dispararPersona(tablero, 1, 1);
        funcionesTablero.dispararPersona(tablero, 1, 0);
        funcionesTablero.mostrarTablero(tablero);
        funcionesTablero.recomendarDisparo(tablero);

    }
    @Test
    public void testCondicionesMaritimas()throws ExcepcionColumna0oNegativa, ExcepcionFila0oNegativa, ExcepcionDisparoFueraMatriz,ExcepcionDisparoNegativo, ExcepcionTamañoMinimoMatriz{
        FuncionesTablero funcionesTablero = new FuncionesTablero();
        String[][] tablero = funcionesTablero.crearTablero(2, 2);
        funcionesTablero.dondeVaBarco(tablero);
        funcionesTablero.dispararPersona(tablero, 1, 1);
        funcionesTablero.mostrarTablero(tablero);
        funcionesTablero.recomendarDisparo(tablero);
    }
}
