# Entrega Tema 8

Repositorio: [https://github.com/ffernandoss/entregaTema8.git](https://github.com/ffernandoss/entregaTema8.git)

## Ejercicio 1

Este ejercicio lo he hecho intentando seguir el patrón de diseño factory para practicar. He usado este patrón ya que el número de fichas, la animación y el número de caras del dado va a ser igual en todos los usuarios.

### Clases:

- **Dado**: Tiene un método para lanzar el dado, otro para comprobar el ganador, otro para cambiar el saldo de fichas una vez acabada la partida y otro para comprobar el saldo de los jugadores.
- **Main**: Implementa la lógica de las clases, donde se crea un jugador y un segundo jugador el cual se clona del primero, se lanzan los dados, se comprueba el ganador y se cambiará el saldo de los jugadores, junto con la opción de jugar otra partida.
- **Jugador**: Hereda de prototipoJugador, tiene un constructor el cual inicializa los jugadores, y otro método el cual recibe un objeto de prototipoJugador, también tiene un toString y un método abstracto de tipo prototipoJugador llamado clone el cual devuelve un new Jugador.

### Excepciones:

- **excepcionApuestaNegativa**: Salta si la apuesta es negativa.
- **excepcionApuestaMayorSaldo**: Salta si la apuesta es mayor que el saldo del jugador.

### Clases Abstractas:

- **PrototipoJugador**: Tiene los atributos del jugador, 2 constructores al igual que la clase Jugador, los getters y setters y en el abstracto método clone.

Este ejercicio junto con el diagrama UML se encuentra dentro del paquete java en el módulo ejercicio1.

## Ejercicio 2

### Clases:

- **Libros**: Extiende de Obra, tiene un atributo numPaginas, un constructor getter y setter y un toString.
- **Main**: Crea un cliente con un libro y un pedido y lo añade a la lista de obras, luego se vuelve a hacer con un segundo cliente, y luego esos pedidos se añaden a una segunda lista de Pedidos, luego para un tercer cliente, se crea un libro y un video, luego con ese tercer cliente se busca al cliente más compatible, y si lo hay muestra su libro y su video.
- **Obra**: Tiene 2 atributos título y autor, un constructor, getters, setters y el toString.
- **Pedidos**: Tiene un atributo llamado cliente, y una lista de obras, un constructor, un método de añadir obra donde se añade la obra, uno para mostrar los pedidos, para buscar el cliente más compatible y las obras comunes, también están los getters y setters.
- **Videos**: Extiende de Obra, tiene un atributo duración, un constructor getter y setter y un toString.

Este ejercicio junto con el diagrama UML se encuentra dentro del paquete java en el módulo ejercicio2.

## Ejercicio 3

### Clases:

- **FuncionesTablero**: Tiene un método para crear el tablero, otros dos que devuelven un número random, otro para colocar el barco de forma horizontal y otro para ponerlo de forma vertical, un método el cual decide de forma aleatoria si el barco irá horizontal o vertical, el método para disparar, un método booleano de condicionesMaritimas el cual podrá o no cambiar la posición del barco, un método para comprobar la victoria, otro para recomendar el disparo y finalmente un método para mostrar el tablero.
- **Main**: La clase se encarga de desarrollar toda la lógica de los métodos de FuncionesTablero, donde el usuario va a poder seguir disparando hasta ganar.

### Excepciones:

- **ExcepcionColumna0oNegativa**: La cual saltará si se introduce un número de columnas negativas.
- **ExcepcionDisparoFuera**: Salta si la posición del disparo no está dentro del tamaño de la matriz.
- **ExcepcionDisparoNegativo**: Salta si la posición del disparo es negativa.
- **ExcepcionFila0oNegativa**: La cual saltará si se introduce un número de filas negativas.
- **ExcepcionTamañoMinimoMatriz**: La cual salta si el tamaño de la matriz es menor a 2x2.

Este ejercicio junto con el diagrama UML se encuentra dentro del paquete java en el módulo ejercicio3.

## Ejercicio 4

### Clases:

- **BarcoIA**: Implementa de funcionesTablero, tiene un método donde la máquina coloca el barco, un método para disparar, el método de comprobar victoria, el de condiciones climáticas, resetear la posición si el método de condiciones climáticas es true, sino no pasa nada, y un método para posicionar el barco en la nueva posición.
- **BarcoPersona**: También implementa de FuncionesTablero, tiene los mismos métodos que BarcoIA ya que ambos implementan de la misma interfaz, pero desarrollados de forma distinta.
- **Main**: Implementa toda la lógica para crear el barco del usuario, disparar y comprobar victoria.
- **Tablero**: Tiene el método de crear tablero y mostrar tablero.

### Excepciones:

- **ExcepcionColumna0oNegativa**: La cual saltará si se introduce un número de columnas negativas.
- **ExcepcionColumnaFueraMatriz**: Salta si se quiere posicionar el barco en una columna que no está en la matriz.
- **ExcepcionFila0oNegativa**: La cual saltará si se introduce un número de filas negativas.
- **ExcepcionFilaFueraMatriz**: Salta si se quiere posicionar el barco en una fila que no está en la matriz.

### Interfaz:

- **FuncionesTablero**: Tiene los métodos de obtener los randoms, condiciones climáticas, resetear posición y colocar en la nueva posición, los métodos de crear barco y disparar no están ya que reciben diferentes parámetros.

Este ejercicio junto con el diagrama UML se encuentra dentro del paquete java en el módulo ejercicio4.

## Tests

Dentro de la carpeta java del paquete test, están las clases testEjercicio1, testEjercicio2, testEjercicio3 y testEjercicio4 para realizar pruebas.
