/* Created by Aleksandr 
                       Smirnov
                                */
package lesson14;

public class CurrentAgeException extends Exception{
    public CurrentAgeException() {
    }

    public CurrentAgeException(String message) {
        super(message);
    }

    public CurrentAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CurrentAgeException(Throwable cause) {
        super(cause);
    }

    public CurrentAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
