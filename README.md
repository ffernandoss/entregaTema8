https://github.com/ffernandoss/entregaTema8.git

ejercicio 1
este ejercicio lo he hecho intentando seguir el patron de disñeo factory para practicar, he usado este patron ya que el numero de fichas, la animacion y el numero de caras del dado va a ser igual en todos los usuarios

Clases:
Dado, tiene un metodo para lanzar el dado, otro para comprobar el ganador, otro para cambiar el saldo de fichas una vez acabada la partida y otro para comprobar el saldo de los jugadores

Main, implementa la logica de las clases, donde se crea un jugador y un segundo jugador el cual se clona del primero, se lanzan los dados, se comprueba el ganador y se cambiará el saldo de los jugadores, junto con la opcion de jugar otra partida

Jugador, hereda de prototipoJugador, tiene un constructor el cual inicializa los jugadores, y otro metodo el cual recibe un objeto de prototipoJugador, tambien tiene un toString y un metodo abstracto de tipo prototipoJugador llamado clone el cual devuelve un new Jugador


Este ejercicio junto con el diagrama UML se encuentra dentro del paquete java en el modulo ejercicio1
Excepciones:
excepcionApuestaNegativa, salta si la apuesta es negativa
excepcionApuestaMayorSaldo, salta si la apuesta es mayor que el saldo del jugador

ClasesAbstractas:
PrototipoJugador, tiene los atributos del jugador, 2 constructores al igualque la clase Jugador, los getters y setters y en el abstracto metodo clone 


EJERCICIO2









Ejercicio3

Clases:

FuncionesTablero, tiene un metodo para crear el tablero, otros dos que devuelven un numero random, otro para colocar el barco de forma horizontal y otro para ponerlo de forma vertical, un metodo el cual decide de forma aleatoria si el barco irá horizontal o vertical, el metodo para disparar, un metodo booleano de condicionesMaaritimas el cual podra o no cambiar la posicion del barco, un metodo para comprobar la victoria, otro para recomendar el disparo y finalmente un metodo para mostrar el tablero

Main, la clase se encarga de desarrollar toda la logica de los metodos de FuncionesTablero, donde el usuario va a poder seguir disparando hasta ganar

Excepciones:
ExcepcionColumna0oNegativa, la cual saltará si se introduce un tamaño de columnas negativas

ExcepcionDisparoFuera, salta si la posicion del disparo no está dentro del tamaño de la matriz
