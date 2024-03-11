package ejercicio3;

public class ExcepcionColumna0oNegativa extends Exception{
    public ExcepcionColumna0oNegativa() {
    }

    public ExcepcionColumna0oNegativa(String message) {
        super(message);
    }

    public ExcepcionColumna0oNegativa(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionColumna0oNegativa(Throwable cause) {
        super(cause);
    }

    public ExcepcionColumna0oNegativa(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
