package ejercicio3;

public class ExcepcionDisparoNegativo extends Exception{
    public ExcepcionDisparoNegativo() {
    }

    public ExcepcionDisparoNegativo(String message) {
        super(message);
    }

    public ExcepcionDisparoNegativo(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionDisparoNegativo(Throwable cause) {
        super(cause);
    }

    public ExcepcionDisparoNegativo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
