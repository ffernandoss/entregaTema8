package ejercicio3;

public class ExcepcionDisparoFueraMatriz extends Exception{
    public ExcepcionDisparoFueraMatriz() {
    }

    public ExcepcionDisparoFueraMatriz(String message) {
        super(message);
    }

    public ExcepcionDisparoFueraMatriz(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionDisparoFueraMatriz(Throwable cause) {
        super(cause);
    }

    public ExcepcionDisparoFueraMatriz(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
