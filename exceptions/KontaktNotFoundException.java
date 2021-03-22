package com.matylarekawek.exceptions;

public class KontaktNotFoundException extends Exception {
    public KontaktNotFoundException() {
    }

    public KontaktNotFoundException(String message) {
        super(message);
    }

    public KontaktNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public KontaktNotFoundException(Throwable cause) {
        super(cause);
    }

    public KontaktNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
