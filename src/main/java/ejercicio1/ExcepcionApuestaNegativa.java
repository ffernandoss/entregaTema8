package ejercicio1;

public class ExcepcionApuestaNegativa extends Exception{
    public ExcepcionApuestaNegativa() {
    }

    public ExcepcionApuestaNegativa(String message) {
        super(message);
    }

    public ExcepcionApuestaNegativa(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionApuestaNegativa(Throwable cause) {
        super(cause);
    }

    public ExcepcionApuestaNegativa(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
