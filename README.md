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

Este ejercicio junto con el diagrama UML se encuentra dentro del paquete java en el modulo ejercicio1

Ejercicio2

Clases:

Libros, extiende de Obra, tiene un atributo numPaginas, un constructor getter y setter y un toString

Main, crea un cliente con un libro y un pedido y lo añade a la lista de obras, luego se vuelve a hacer con un segundo cliente, y luego esos pedidos se añaden a una segunda lista de Pedidos, luego para un tercer cliente, se crea un libro y un video, luego con ese tercer cliente se busca al cliente mas compatible, y si lo hay muestra su libro y su video

Obra, tiene 2 atributos titulo y autor, un constructor, getters,setters y el toString

Pedidos, tiene un atributo llamado cliente, y una lista de obrass, un constructor, un metodo de añadir obra donde se añade la obra, uno para mostrar los pedidos, para buscar el cliente mas compatible y las obras comunes, tambien estan los getters y setters

Videos, extiende de Obra, tiene un atributo duracion, un constructor getter y setter y un toString

Este ejercicio junto con el diagrama UML se encuentra dentro del paquete java en el modulo ejercicio2







Ejercicio3

Clases:

FuncionesTablero, tiene un metodo para crear el tablero, otros dos que devuelven un numero random, otro para colocar el barco de forma horizontal y otro para ponerlo de forma vertical, un metodo el cual decide de forma aleatoria si el barco irá horizontal o vertical, el metodo para disparar, un metodo booleano de condicionesMaaritimas el cual podra o no cambiar la posicion del barco, un metodo para comprobar la victoria, otro para recomendar el disparo y finalmente un metodo para mostrar el tablero

Main, la clase se encarga de desarrollar toda la logica de los metodos de FuncionesTablero, donde el usuario va a poder seguir disparando hasta ganar

Excepciones:
ExcepcionColumna0oNegativa, la cual saltará si se introduce un numero de columnas negativas

ExcepcionDisparoFuera, salta si la posicion del disparo no está dentro del tamaño de la matriz

ExcepcionDisparoNegativo, salta si la posicion del disparo es negativa

ExcepcionFila0oNegativa, la cual saltará si se introduce un numero de filas negativas

ExcepcionTamañoMinimoMatriz, la cual salta si el tamaño de la matriz es menor a 2x2

Este ejercicio junto con el diagrama UML se encuentra dentro del paquete java en el modulo ejercicio3


ejercicio4

Clases:

BarcoIA, implementa de funcionesTablero, tiene un metodo donde la maquina coloca el barco, un metodo para disparar, el metodo de comprobar victoria, el de condiciones climaticas, resetear la posicion si el metodo de condiciones climaticas es true, sino no pasa nada, y un metodo para posicionar el barco en la nueva posicion

BarcoPersona, tambien implementa de FuncionesTablero, tiene los mismos metodos que BarcoIA ya que ambos implementan de la misma interfaz, pero desarrollados de forma distinta

Main, implementa toda la logica para crear el barco del usuario, disparar y comprobar victoria

Tablero, tiene el metodo de crear tablero y mostrar tablero

Excepciones:

ExcepcionColumna0oNegativa, la cual saltará si se introduce un numero de columnas negativas

ExcepcionColumnaFueraMatriz, salta si se quiere posicionar el barco en una columna que no esta en la matriz

ExcepcionFila0oNegativa, la cual saltará si se introduce un numero de filas negativas

ExcepcionFilaFueraMatriz, salta si se quiere posicionar el barco en una fila que no esta en la matriz

Interfaz:

FuncionesTablero, tiene los metodos de obtener los randoms, condiciones climaticas, resetear posicion y colocar en la nueva posicion, los metodos de crear barco y disparar no están ya que reciben diferentes parametros

Este ejercicio junto con el diagrama UML se encuentra dentro del paquete java en el modulo ejercicio4

Tests
dentro de la carpeta java del paquete test, estan las clases testEjercicio1, testEjercicio2, testEjercicio3 y testEjercicio4 para realizar pruebas
