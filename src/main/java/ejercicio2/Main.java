package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un libro, un video y un pedido para el cliente 1
        Libros libro1 = new Libros("Titulo1", "Autor1", 200);
        Videos video1 = new Videos("Video1", "Autor1", 120);
        Pedidos pedido1 = new Pedidos("Cliente1");
        pedido1.addObra(libro1);
        pedido1.addObra(video1);

        // Crear un libro, un video y un pedido para el cliente 2
        Libros libro2 = new Libros("Titulo2", "Autor2", 220);
        Videos video2 = new Videos("Video2", "Autor2", 150);
        Pedidos pedido2 = new Pedidos("Cliente2");
        pedido2.addObra(libro2);
        pedido2.addObra(video2);

        // Crear una lista de todos los pedidos
        List<Pedidos> todosLosPedidos = new ArrayList<>();
        todosLosPedidos.add(pedido1);
        todosLosPedidos.add(pedido2);

        Libros libro3 = new Libros("Titulo2", "Autor2", 230);
        Videos video3 = new Videos("Video1", "Autor2", 160);
        Pedidos pedido3 = new Pedidos("Cliente3");
        pedido3.addObra(libro3);
        pedido3.addObra(video3);



        Pedidos clienteCompatible = pedido3.clienteMasCompatible(todosLosPedidos);

        // Mostrar las recomendaciones
        if (clienteCompatible != null) {
            System.out.println("El cliente más compatible con " + pedido3.getCliente() + " es: " + clienteCompatible.getCliente());
            System.out.println("Obras del cliente compatible: ");
            clienteCompatible.mostrarPedidos();
        } else {
            System.out.println("No se encontró un cliente compatible");
        }
    }
}