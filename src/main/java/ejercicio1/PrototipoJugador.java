package ejercicio1;

public abstract class PrototipoJugador {
   protected String nombre;
    protected int  fichas;
    protected int dado;
    protected String animacion;


    public PrototipoJugador(String nombre, int fichas, int dado, String animacion) {
        this.nombre = nombre;
        this.fichas = fichas;
        this.dado = dado;
        this.animacion = animacion;
    }

    public PrototipoJugador(PrototipoJugador prototipoJugador) {
        if (prototipoJugador != null) {
            setNombre(prototipoJugador.getNombre());
            setFichas(prototipoJugador.getFichas());
            setDado(prototipoJugador.getDado());
            setAnimacion(prototipoJugador.getAnimacion());
        }
    }

    public abstract PrototipoJugador clone();
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public String getAnimacion() {
        return animacion;
    }

    public void setAnimacion(String animacion) {
        this.animacion = animacion;
    }
}
