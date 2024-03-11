package ejercicio4;

public class ExcepcionColumnaFueraMatriz extends Exception{
    public ExcepcionColumnaFueraMatriz() {
    }

    public ExcepcionColumnaFueraMatriz(String message) {
        super(message);
    }

    public ExcepcionColumnaFueraMatriz(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionColumnaFueraMatriz(Throwable cause) {
        super(cause);
    }

    public ExcepcionColumnaFueraMatriz(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
