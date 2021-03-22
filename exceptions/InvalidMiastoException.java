package com.matylarekawek.exceptions;

public class InvalidMiastoException extends Exception {
    public InvalidMiastoException() {
    }

    public InvalidMiastoException(String message) {
        super(message);
    }

    public InvalidMiastoException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMiastoException(Throwable cause) {
        super(cause);
    }

    public InvalidMiastoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
