package ejercicio3;

public class ExcepcionFila0oNegativa extends Exception{
    public ExcepcionFila0oNegativa() {
    }

    public ExcepcionFila0oNegativa(String message) {
        super(message);
    }

    public ExcepcionFila0oNegativa(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionFila0oNegativa(Throwable cause) {
        super(cause);
    }

    public ExcepcionFila0oNegativa(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
