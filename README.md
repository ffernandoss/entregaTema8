https://github.com/ffernandoss/entregaTema8.git

ejercicio 1
este ejercicio lo he hecho intentando seguir el patron de disñeo factory para practicar, he usado este patron ya que el numero de fichas, la animacion y el numero de caras del dado va a ser igual en todos los usuarios

Clases:
Dado, tiene un metodo para lanzar el dado, otro para comprobar el ganador, otro para cambiar el saldo de fichas una vez acabada la partida y otro para comprobar el saldo de los jugadores

Main, implementa la logica de las clases, donde se crea un jugador y un segundo jugador el cual se clona del primero, se lanzan los dados, se comprueba el ganador y se cambiará el saldo de los jugadores, junto con la opcion de jugar otra partida

Jugador, hereda de prototipoJugador, tiene un constructor el cual inicializa los jugadores, y otro metodo el cual recibe un objeto de prototipoJugador, tambien tiene un toString y un metodo abstracto de tipo prototipoJugador llamado clone el cual devuelve un new Jugador

Excepciones:
excepcionApuestaNegativa, salta si la apuesta es negativa
excepcionApuestaMayorSaldo, salta si la apuesta es mayor que el saldo del jugador

ClasesAbstractas:
PrototipoJugador, tiene los atributos del jugador, 2 constructores al igualque la clase Jugador, los getters y setters y en el abstracto metodo clone 
