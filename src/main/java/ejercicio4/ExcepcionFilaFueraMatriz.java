package ejercicio4;

public class ExcepcionFilaFueraMatriz extends Exception{
    public ExcepcionFilaFueraMatriz() {
    }

    public ExcepcionFilaFueraMatriz(String message) {
        super(message);
    }

    public ExcepcionFilaFueraMatriz(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionFilaFueraMatriz(Throwable cause) {
        super(cause);
    }

    public ExcepcionFilaFueraMatriz(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
