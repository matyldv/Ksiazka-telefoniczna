package com.matylarekawek.exceptions;

public class InvalidNrDomuException extends Exception {
    public InvalidNrDomuException() {
    }

    public InvalidNrDomuException(String message) {
        super(message);
    }

    public InvalidNrDomuException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNrDomuException(Throwable cause) {
        super(cause);
    }

    public InvalidNrDomuException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
