package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private String cliente;
    private List<Obra> obrasCompradas;

    public Pedidos(String cliente) {
        this.cliente = cliente;
        this.obrasCompradas = new ArrayList<>();
    }

    public void addObra(Obra obra) {
        obrasCompradas.add(obra);
    }

    public void mostrarPedidos() {
        System.out.println("Cliente: " + cliente);
        for (Obra obra : obrasCompradas) {
            System.out.println("Recomendaciones: " + obra);
        }
    }

    public Pedidos clienteMasCompatible(List<Pedidos> todosLosPedidos) {
        int maxObrasComunes = -1;
        Pedidos clienteCompatible = null;

        for (Pedidos pedido : todosLosPedidos) {
            if (!pedido.cliente.equals(this.cliente)) {
                int obrasComunes = contarObrasComunes(this, pedido);
                if (obrasComunes > maxObrasComunes) {
                    maxObrasComunes = obrasComunes;
                    clienteCompatible = pedido;
                }
            }
        }

        return clienteCompatible;
    }

    public int contarObrasComunes(Pedidos cliente1, Pedidos cliente2) {
        int obrasComunes = 0;

        for (Obra obra1 : cliente1.obrasCompradas) {
            for (Obra obra2 : cliente2.obrasCompradas) {
                if (obra1.getTitulo().equals(obra2.getTitulo()) && obra1.getAutor().equals(obra2.getAutor()) && obra1.getClass().equals(obra2.getClass())) {
                    obrasComunes++;
                }
            }
        }

        return obrasComunes;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Obra> getObrasCompradas() {
        return obrasCompradas;
    }

    public void setObrasCompradas(List<Obra> obrasCompradas) {
        this.obrasCompradas = obrasCompradas;
    }
}