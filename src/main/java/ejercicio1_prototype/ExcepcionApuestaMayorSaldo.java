package ejercicio1_prototype;

public class ExcepcionApuestaMayorSaldo extends Exception{
    public ExcepcionApuestaMayorSaldo() {
    }

    public ExcepcionApuestaMayorSaldo(String message) {
        super(message);
    }

    public ExcepcionApuestaMayorSaldo(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcepcionApuestaMayorSaldo(Throwable cause) {
        super(cause);
    }

    public ExcepcionApuestaMayorSaldo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
