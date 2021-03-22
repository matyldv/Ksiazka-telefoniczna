package com.matylarekawek.exceptions;

public class InvalidImieException extends Exception {
    public InvalidImieException() {
    }

    public InvalidImieException(String message) {
        super(message);
    }

    public InvalidImieException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidImieException(Throwable cause) {
        super(cause);
    }

    public InvalidImieException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
