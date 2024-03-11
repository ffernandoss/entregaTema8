import ejercicio2.Libros;
import ejercicio2.Pedidos;
import ejercicio2.Videos;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testEjercicio2 {

    @Test
    public void crearLibro(){
        Libros libro = new Libros("El Quijote", "Cervantes",345);
        assertEquals("El Quijote", libro.getTitulo());
        assertEquals("Cervantes", libro.getAutor());
    }

    @Test
    public void crearVideos(){
        Videos video = new Videos("Video1", "Autor1",345);
        assertEquals("Video1", video.getTitulo());
        assertEquals("Autor1", video.getAutor());
    }

    @Test
    public void crearObra(){
        Pedidos pedido = new Pedidos("Cliente1");
        Libros libro = new Libros("El Quijote", "Cervantes",345);
        Videos video = new Videos("Video1", "Autor1",345);
        pedido.addObra(libro);
    }
}
