package ejercicio1_prototype;

public class Dado {
    public Dado(){

    }
    public int lanzarDado(int dado){
        int resultado=(int)(Math.random()*6+1);
        return resultado;
    }

    public int comprobarGanador(int resultado1, int resultado2){
        if(resultado1>resultado2){
            System.out.println("El jugador 1 ha ganado");

            return 1;

        }else if(resultado1<resultado2){
            System.out.println("El jugador 2 ha ganado");

            return 2;
        }else{
            System.out.println("Empate");
            return 0;
        }

    }

    public void cambiarFichas(int resultado1,int resultado2,int apuesta1 , int apuesta2,PrototipoJugador jugador1,PrototipoJugador jugador2) throws ExcepcionApuestaMayorSaldo, ExcepcionApuestaNegativa{
        if (apuesta1>jugador1.getFichas() || apuesta2>jugador2.getFichas()){
            throw new ExcepcionApuestaMayorSaldo("La apuesta no puede ser mayor que el saldo");
        }
        if (apuesta1<0 || apuesta2<0){
            throw new ExcepcionApuestaNegativa("La apuesta no puede ser negativa");
        }
        int ganador=comprobarGanador(resultado1,resultado2);

        if(ganador==1){
            jugador1.setFichas(jugador1.getFichas()+apuesta2);
            jugador2.setFichas(jugador2.getFichas()-apuesta2);
            comprobarSaldo(jugador1, jugador2);
        }else if (ganador==2){
            jugador2.setFichas(jugador2.getFichas()+apuesta1);
            jugador1.setFichas(jugador1.getFichas()-apuesta1);
            comprobarSaldo(jugador1, jugador2);
        }
        else {
            System.out.println("manteneis el mismo saldo de fichas");
        }
    }

    public void comprobarSaldo(PrototipoJugador jugador1,PrototipoJugador jugador2){
        if (jugador1.getFichas()<=0){
            System.out.println("El jugador 1 se ha quedado sin dinero");
        }
        if (jugador2.getFichas()<=0){
            System.out.println("El jugador 2 se ha quedado sin dinero");
        }
    }

}
