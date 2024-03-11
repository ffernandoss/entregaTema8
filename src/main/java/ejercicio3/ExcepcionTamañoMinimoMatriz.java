package ejercicio3;

public class ExcepcionTamañoMinimoMatriz extends Exception{
    public ExcepcionTamañoMinimoMatriz() {
    }

    public ExcepcionTamañoMinimoMatriz(String message) {
        super(message);
    }

    public ExcepcionTamañoMinimoMatriz(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionTamañoMinimoMatriz(Throwable cause) {
        super(cause);
    }

    public ExcepcionTamañoMinimoMatriz(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
