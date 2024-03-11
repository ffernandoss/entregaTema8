import org.junit.Test;


import static org.junit.Assert.assertTrue;
import ejercicio1_prototype.*;
public class TestEjercicio1 {
    @Test
    public void testDado() {
        Dado dado = new Dado();
        int resultado = dado.lanzarDado(6);
        System.out.println(resultado);
        assertTrue(resultado >= 1 && resultado <= 6);
    }
    @Test
    public void testComprobarGanador() {
        Dado dado = new Dado();
        int resultado1 = dado.lanzarDado(6);
        int resultado2 = dado.lanzarDado(6);
        int ganador = dado.comprobarGanador(resultado1, resultado2);
        assertTrue(ganador == 1 || ganador == 2 || ganador == 0);
    }

    @Test
    public void testExcepcionApuestaMayorSaldo() {
        Dado dado = new Dado();
        PrototipoJugador jugador1 = new Jugador("Jugador1", 100, 6, "-----------------");
        PrototipoJugador jugador2 = jugador1.clone();
        try {
            dado.cambiarFichas(6, 6, 200, 200, jugador1, jugador2);
        } catch (ExcepcionApuestaMayorSaldo e) {
            assertTrue(e.getMessage().equals("La apuesta no puede ser mayor que el saldo"));
        } catch (ExcepcionApuestaNegativa e) {
            assertTrue(false);
        }
    }

    @Test
    public void TestExcepcionNegativa(){
        Dado dado = new Dado();
        PrototipoJugador jugador1 = new Jugador("Jugador1", 100, 6, "-----------------");
        PrototipoJugador jugador2 = jugador1.clone();
        try {
            dado.cambiarFichas(6, 6, -200, -200, jugador1, jugador2);
        } catch (ExcepcionApuestaMayorSaldo e) {
            assertTrue(false);
        } catch (ExcepcionApuestaNegativa e) {
            assertTrue(e.getMessage().equals("La apuesta no puede ser negativa"));
        }
    }
}
